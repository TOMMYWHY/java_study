package com.tommy.why.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("/index")
    public String index(){return "index";}
    @GetMapping("/add")
    public String add(){return "111111111asddddd";}
    @GetMapping("/del")
    public String del(){return "deldeldeldeldel";}
    @GetMapping("/update")
    public String update(){return "updateupdateupdateupdate";}
    @GetMapping("/show")
    public String show(){return "showshowshowshowshow";}
}
