package com.tommy.why.controller;

import com.tommy.why.model.Student;
import com.tommy.why.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student")
    public @ResponseBody Object student(Integer id){

        Student student = studentService.queryStudentById(id);
        return student;
    }
}
