package com.tommy.why.controller;

import com.tommy.why.annotation.MyAutoWired;
import com.tommy.why.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserController {

//    @Autowired
    @MyAutoWired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
