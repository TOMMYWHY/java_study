package com.tommy.why.service;

import com.tommy.why.model.Student;
import org.springframework.stereotype.Service;


public interface StudentService {

    Student queryStudentById(Integer id);
}
