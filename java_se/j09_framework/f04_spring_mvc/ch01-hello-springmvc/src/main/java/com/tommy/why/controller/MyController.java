package com.tommy.why.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller()
public class MyController {
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","hello Tommy");//request.setAttribute
        mv.addObject("func","doSome executed...");

        mv.setViewName("show");
        return mv;
    }
}
