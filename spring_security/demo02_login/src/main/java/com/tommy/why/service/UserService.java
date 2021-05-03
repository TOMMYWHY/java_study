package com.tommy.why.service;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.SecureUtil;
import com.tommy.why.mapper.UserMapper;
import com.tommy.why.pojo.User;
import org.apache.catalina.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Resource
    private  UserMapper userMapper;

    @Transactional
    public Map<String,Object> createAccount(User user){
        String confirmCode = IdUtil.getSnowflake(1,1).nextIdStr();
        String salt = RandomUtil.randomString(6);
        String md5Pwd = SecureUtil.md5( user.getPassword()+salt);
        LocalDateTime ldt = LocalDateTime.now().plusDays(1);
        user.setSalt(salt);
        user.setPassword(md5Pwd);
        user.setConfirmCode(confirmCode);
        user.setActivationTime(ldt);
        user.setIsValid((byte)0);
        int result = userMapper.insertUser(user);
        Map<String,Object> resultMap = new HashMap<>();
        if(result>0){
            //todo send email
            resultMap.put("code",200);
            resultMap.put("msg","register success~!");
        }else{
            resultMap.put("code",400);
            resultMap.put("msg","register fail~!");
        }
        return resultMap;
    }
}
