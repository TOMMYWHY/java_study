package com.tommy.why.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
//@RestController
public class HelloController {

//    @ResponseBody
    @RequestMapping("/hello")
    public String handle01(){
        return "hello Tommy";
    }
}
