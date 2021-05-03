package com.tommy.why.controller;

import com.tommy.why.pojo.User;
import com.tommy.why.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;


    @PostMapping("create")
    public Map<String,Object> createAccount (User user){
       return   userService.createAccount(user);
    }

    @PostMapping ("login")
    public Map<String,Object> loginAccount (User user){
        return   userService.loginAccount(user);
    }

    @GetMapping ("activation")
    public Map<String,Object> activateAccount (String confirmCode){
        return  userService.activationAccount(confirmCode) ;
    }
}
