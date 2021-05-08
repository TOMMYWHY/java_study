package com.tommy.why.controller;


import com.tommy.why.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class LoginController {

//    private static List<UserEntity> userEntityList = new ArrayList<>();
//    static {
//        userEntityList.add(new UserEntity("tommy","123","admin"));
//    }


    @GetMapping ("/login")
    public String login(){
        return "login";
    }
////
//    @PostMapping ("/login")
//    public String login(){
//        return "login";
//    }
}
