package com.tommy.why.controller;

import com.tommy.why.entity.Student;
import com.tommy.why.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService service;

    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student){

        ModelAndView mv = new ModelAndView();
        String tips= "register fail~!";
        int nums = service.addStudent(student);
        if(nums > 0){
            tips = student.getName() + " register successful~!";
        }
        mv.addObject("tips",tips);
        mv.setViewName("result");
        return mv;
    }
}
