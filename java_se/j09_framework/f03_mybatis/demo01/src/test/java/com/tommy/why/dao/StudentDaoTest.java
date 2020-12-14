package com.tommy.why.dao;

import com.tommy.why.entity.Student;
import com.tommy.why.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.getStudentsList();
        for (Student stu : students){
            System.out.println(stu);
        }
    }
}
