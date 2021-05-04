package com.tommy.why.controller;

import com.tommy.why.pojo.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Controller
@ResponseBody
//@RestController
public class HelloController {




//    @ResponseBody
    @RequestMapping("/hello")
    public String handle01(){
        log.info("11111");
        return "hello Tommywhy~!";
    }


    @Autowired
    private Car car;
    @RequestMapping("/car")
    public Car car(){
        return car;
    }
}


