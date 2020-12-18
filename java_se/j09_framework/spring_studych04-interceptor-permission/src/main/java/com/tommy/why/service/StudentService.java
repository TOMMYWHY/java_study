package com.tommy.why.service;

import com.tommy.why.entity.Student;

import java.util.List;

public interface StudentService {

    int addStudent(Student student);
    List<Student> findStudents();
}
