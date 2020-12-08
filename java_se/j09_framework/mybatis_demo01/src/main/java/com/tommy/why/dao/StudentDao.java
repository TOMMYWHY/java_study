package com.tommy.why.dao;

import com.tommy.why.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface
StudentDao {
    public List<Student> selectStudents();
    public int insertStudent(Student student);
    List<Student> selectMultiParam(@Param("myName") String name,
                                   @Param("myAge") Integer age);
}
