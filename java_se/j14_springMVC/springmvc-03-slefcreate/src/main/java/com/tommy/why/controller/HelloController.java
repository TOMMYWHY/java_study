package com.tommy.why.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mv = new ModelAndView();

        String result = "hello tommy....";

        mv.addObject("smg",result);

        mv.setViewName("test");
        return mv;
    }
}
