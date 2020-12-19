package com.tommy.why.controller;

import com.tommy.why.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Value("${school.name}")
    private String schoolName;

    @Autowired
    private School school;


    @RequestMapping(value = "a")
    @ResponseBody
    public Object say(String msg){

//        return "say hi "+ msg + "; school name:"+ schoolName;
        return "say hi school name:"+ school.getName() + "; school addr:"+ school.getAddr();
    }
}
