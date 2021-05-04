package com.tommy.why.controller;

import com.tommy.why.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping("/person")
    public Person getPerson(){

        return person;
    }
}
