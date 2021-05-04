package com.tommy.why.controller;

import com.tommy.why.model.UserInfo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "hello tommy";
    }


    @GetMapping("/user")
    public UserInfo getUser(@RequestParam(required = false) String name, @RequestParam(required = false) String userId){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        userInfo.setName(name);
        return userInfo;
    }

    @PostMapping("/user")
    public UserInfo postUser(@RequestBody UserInfo userInfo){
          return  userInfo;
    }
}
