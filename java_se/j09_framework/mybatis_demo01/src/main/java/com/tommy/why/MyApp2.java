package com.tommy.why;

import com.tommy.why.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyApp2 {
    public static void main(String[] args) throws IOException {

        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.tommy.why.dao.StudentDao" + "."+"selectStudents";
        List<Student> studentList = sqlSession.selectList(sqlId);
//        studentList.forEach(stu-> System.out.println(stu));
        for (Student stu:studentList){
            System.out.println(stu);
        }
        sqlSession.close();
    }
}
