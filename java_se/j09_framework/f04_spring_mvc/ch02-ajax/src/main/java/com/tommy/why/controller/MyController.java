package com.tommy.why.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tommy.why.controller.ov.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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

    @RequestMapping(value = "/returnVoid-ajax.do")
    public void doReturnVoidAjax(HttpServletRequest request,
                                 HttpServletResponse response,
                                 String name,
                                 Integer age
                                 ) throws IOException {
        System.out.println("-----receive ajax post name:"+name + " age:"+age);
        Student student = new Student(name+" why", age+10);

        String json ="";
        ObjectMapper om = new ObjectMapper();
        json = om.writeValueAsString(student);
        System.out.println("---jason student: "+ json);

        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.println(json);
        writer.flush();
        writer.close();
    }
}
