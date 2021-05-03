package com.tommy.why.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class   SystemController {
    @GetMapping("login")
    public String login(){
        return "login";
    }

    @GetMapping("register")
    public String registry(){
        return "registry";
    }
}
