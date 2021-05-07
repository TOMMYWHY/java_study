package com.tommy.why.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("/index")
    public String index(){return "index";}
    @GetMapping("/addMember")
    public String add(){return "111111111asddddd";}
    @GetMapping("/delMember")
    public String del(){return "deldeldeldeldel";}
    @GetMapping("/updateMember")
    public String update(){return "updateupdateupdateupdate";}
    @GetMapping("/showMember")
    public String show(){return "showshowshowshowshow";}
}
