package com.tommy.why.controller;


import com.tommy.why.bean.UserBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.omg.CORBA.OBJECT_NOT_EXIST;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/common")
public class LoginController {

    private Logger log  = LoggerFactory.getLogger(LoginController.class);

    @PostMapping("login")
    public Object login(UserBean userBean){
        Map<String, String> errorMsg = new HashMap<>();

        Subject currentUser = SecurityUtils.getSubject();
//        if( !currentUser.isAuthenticated()){
            UsernamePasswordToken token= new UsernamePasswordToken(userBean.getUserName(),userBean.getUserPass());
//            return "login successful~!";
            try {
                currentUser.login(token);
                currentUser.getSession().setAttribute("currentUser",currentUser.getPrincipal());

            } catch (UnknownAccountException uae) {
                log.info("There is no user with username of " + token.getPrincipal());
                errorMsg.put("errorMsg", " no user with username");
            } catch (IncorrectCredentialsException ice) {
                log.info("Password for account " + token.getPrincipal() + " was incorrect!");
                errorMsg.put("errorMsg", " Password incorrect");

            } catch (LockedAccountException lae) {
                log.info("The account for username " + token.getPrincipal() + " is locked.  " +
                        "Please contact your administrator to unlock it.");
                errorMsg.put("errorMsg", " username locked");

            }
            // ... catch more exceptions here (maybe custom ones specific to your application?
            catch (AuthenticationException ae) {
                //unexpected condition?  error?
                errorMsg.put("errorMsg", " fail to login");
            }

            return errorMsg;
//        }else {
//
//        }
//        return errorMsg;
    }


    @RequestMapping("/getCurrentUser")
    public Object getCurrentUser(){
        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        return session.getAttribute("currentUser");
    }

    public void logout(){}
}
