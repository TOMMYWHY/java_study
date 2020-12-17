package com.tommy.why.service;

import com.tommy.why.dao.StudentDao;
import com.tommy.why.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private  StudentDao studentDao; // 将容器中的dao 对象赋值

    @Override
    public int addStudent(Student student) {
        int result = studentDao.insertStudent(student);
        return result;
    }

    @Override
    public List<Student> findStudents() {
        List<Student> students = studentDao.selectStudents();
        return students;
    }
}
