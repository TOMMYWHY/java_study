package com.tommy.why.controller;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello tommy";
    }
}
