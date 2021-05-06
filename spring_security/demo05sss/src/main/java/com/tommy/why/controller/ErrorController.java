package com.tommy.why.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error")
public class ErrorController {

    @GetMapping("/400")
    public String errorPage400(){return "error ~! 400";}
    @GetMapping("/403")
    public String errorPage403(){return "error ~! 403";}

}
