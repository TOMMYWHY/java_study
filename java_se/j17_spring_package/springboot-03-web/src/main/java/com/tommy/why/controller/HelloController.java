package com.tommy.why.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/a")
    public String test(){
        return "aaaa";
    }
}
