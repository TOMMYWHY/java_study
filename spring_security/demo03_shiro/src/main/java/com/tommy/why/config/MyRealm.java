package com.tommy.why.config;

import com.tommy.why.bean.UserBean;
import com.tommy.why.service.UserService;
import org.apache.log4j.Logger;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Configuration
public class MyRealm extends AuthorizingRealm {

    @Resource
    private UserService userService;
//    private Logger logger= (Logger) LoggerFactory.getLogger(MyRealm.class);

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        logger.info("授权<<entered myRealm doGetAuthorizationInfo ");
        return null;
    }


    // 认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        logger.info("认证<<entered myRealm doGetAuthenticationInfo");

        UsernamePasswordToken userToken = (UsernamePasswordToken) authenticationToken;

        String username = userToken.getUsername();
        UserBean userBean = userService.queryUserByName(username);

        if(null == userBean){
            return null;
        }


        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(
                userBean,userBean.getUserPass(),"myRealm"
        );

        return info;
    }
}
