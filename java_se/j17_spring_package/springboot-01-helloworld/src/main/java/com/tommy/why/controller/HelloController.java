package com.tommy.why.controller;

import com.tommy.why.pojo.Car;
import org.springframework.beans.factory.annotation.Autowired;
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


    @Autowired
    private Car car;
    @RequestMapping("/car")
    public Car car(){
        return car;
    }
}


