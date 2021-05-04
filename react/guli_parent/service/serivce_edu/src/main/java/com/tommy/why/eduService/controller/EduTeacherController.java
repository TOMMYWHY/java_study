package com.tommy.why.eduservice.controller;


import com.tommy.why.eduservice.entity.EduTeacher;
import com.tommy.why.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author TommyJiang
 * @since 2021-02-14
 */
@RestController
@RequestMapping("/eduservice/teacher")
public class EduTeacherController {
    @Autowired
    private EduTeacherService teacherService;

    @GetMapping("findAll")
    public List<EduTeacher> findAllTeacher(){
        System.out.println("teacherService：" + teacherService);
        List<EduTeacher> list = teacherService.list(null);
        return list;
    }

    @DeleteMapping("delete/{id}")
    public boolean removeTeacher(@PathVariable String id){
        boolean result = teacherService.removeById(id);
        return result;
    }
}

