package com.tommy.why.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FilterController {

    @GetMapping("hello")
    public String hello(){
        return "hello tommy";
    }
}
