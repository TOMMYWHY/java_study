package com.tommy.why.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","hello tommy");

        return "hello";
    }


    @RequestMapping(value="/restful/{a}/{b}")
    public String test01(@PathVariable int a, @PathVariable int b, Model model){

        int res = a+b;
        model.addAttribute("msg",res);
        return "test";
    }
}
