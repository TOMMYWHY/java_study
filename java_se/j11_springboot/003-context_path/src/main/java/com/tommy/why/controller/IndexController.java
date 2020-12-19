package com.tommy.why.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        return "say:hello tommy";
    }

    @RequestMapping(value = "/map-value")
    public @ResponseBody Map<String,Object> mapValue(){
        Map<String, Object> map = new HashMap<>();
        map.put("msg","tommywhy");
        return map;
    }
}
