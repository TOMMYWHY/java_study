package com.tommy.why;

import com.tommy.why.dao.StudentDao;
import com.tommy.why.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class MyApp3 {
    public static void main(String[] args) throws IOException {

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        System.out.println("============studentDao.class:"+StudentDao.class);//反射
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = dao.selectStudents();
        for (Student stu:studentList){
            System.out.println(stu);
        }
        sqlSession.close();
    }
}
