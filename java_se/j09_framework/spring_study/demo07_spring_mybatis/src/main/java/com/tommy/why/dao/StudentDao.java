package com.tommy.why.dao;

import com.tommy.why.entity.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudents();

}
