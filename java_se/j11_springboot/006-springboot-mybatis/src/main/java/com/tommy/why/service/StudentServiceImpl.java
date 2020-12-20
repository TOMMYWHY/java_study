package com.tommy.why.service;

import com.tommy.why.dao.StudentMapper;
import com.tommy.why.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }
}
