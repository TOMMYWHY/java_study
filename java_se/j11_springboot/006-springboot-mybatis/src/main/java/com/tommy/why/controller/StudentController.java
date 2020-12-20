package com.tommy.why.controller;

import com.tommy.why.model.Student;
import com.tommy.why.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student")
    public @ResponseBody Object student(Integer id){

        Student student = studentService.queryStudentById(id);
        return student;
    }


    @RequestMapping(value = "/student/add")
    public @ResponseBody Object studentUpdate(Integer id,String name){

        Student student = new Student();
        student.setId(id);
        student.setName(name);

        int updateCount = studentService.updateStudentById(student);
        return updateCount;
    }


    @RequestMapping(value = "/student1/detail/{id}/{name}")
    public Object testRestful (
            @PathVariable("id") Integer id,
            @PathVariable("name") String name){
        Student student = new Student();
        student.setId(1001);
        student.setName("wocao");


        return student;

    }
}
