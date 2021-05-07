package com.tommy.why.service;


import com.tommy.why.entity.PermissionEntity;
import com.tommy.why.entity.UserEntity;
import com.tommy.why.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.slf4j.ILoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Component
@Slf4j
public class MemberUserDetailsService  implements UserDetailsService {

//    @Mapper
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // query form db
        UserEntity userEntity =userMapper.findByUsername(username);
//        log.info(">>>userEntity:{}<<<", userEntity);

        if(userEntity==null){return null;}
        List<PermissionEntity> permissionEntityList = userMapper.findPermissionByUsername(username);
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        permissionEntityList.forEach(user->{
            authorities.add(new SimpleGrantedAuthority(user.getPermTag()));

        });
        log.info(">>>authorities:{}<<<", authorities);
//        userEntity.setAuthorities(authorities);

        userEntity.setAuthorities(authorities);
        log.info(">>>userEntity:{}<<<", userEntity);


        return userEntity;
    }
}
