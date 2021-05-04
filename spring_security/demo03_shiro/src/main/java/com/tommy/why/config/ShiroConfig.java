package com.tommy.why.config;

import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.ShiroFilter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    // realm
//    @Bean
//    public Realm myRealm(){
//        return new MyRealm();
//    }
    // security manager
    @Bean
    public DefaultWebSecurityManager mySecurityManager(Realm myRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myRealm);
        return securityManager;
    }


    // shiro filter factory bean
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(DefaultWebSecurityManager mySecurityManager){
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        factoryBean.setSecurityManager(mySecurityManager);
        Map<String,String> filterMap = new HashMap<>();

        filterMap.put("/mobile/**","authc");
        filterMap.put("/salary/**","authc");
        factoryBean.setFilterChainDefinitionMap(filterMap);
        return factoryBean;
    }
}
