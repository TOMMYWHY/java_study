package com.tommy.why.service;

import com.tommy.why.dao.StudentMapper;
import com.tommy.why.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }


    @Transactional
    @Override
    public int updateStudentById(Student student) {


        int i = studentMapper.updateByPrimaryKeySelective(student);
        int a = 10/0;

        return i;
    }


}
