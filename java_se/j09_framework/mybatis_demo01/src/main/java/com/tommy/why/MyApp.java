package com.tommy.why;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyApp {
    public static void main(String[] args) throws IOException {
        String config = "mybatis.xml";
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        String sqlId = "com.tommy.why.dao.StudentDao" + "."+"selectStudents";
        List<Student> studentList = sqlSession.selectList(sqlId);
//        studentList.forEach(stu-> System.out.println(stu));
        for (Student stu:studentList){
            System.out.println(stu);
        }
        sqlSession.close();
    }
}
