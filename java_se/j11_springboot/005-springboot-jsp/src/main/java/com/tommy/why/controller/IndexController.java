package com.tommy.why.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.RequestWrapper;

@Controller
public class IndexController {

    @RequestMapping(value="/test-jsp-demo")
    public ModelAndView testJspDemo(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","testJspDemo");
        mv.setViewName("show");
        return mv;
    }
}
