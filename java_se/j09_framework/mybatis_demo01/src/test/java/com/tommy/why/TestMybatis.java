package com.tommy.why;

import com.tommy.why.dao.StudentDao;
import com.tommy.why.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void testInsert() throws IOException {
        String config = "mybatis.xml";
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
//        SqlSession sqlSession = factory.openSession();
        SqlSession sqlSession = factory.openSession(true);
        String sqlId = "com.tommy.why.dao.StudentDao" + "."+"insertStudent";
        Student stu = new Student();
        stu.setName("fuckering");
        stu.setId(1003);
        stu.setAge(103);
        int num = sqlSession.insert(sqlId,stu);
//        sqlSession.commit();
        System.out.println(num);
        sqlSession.close();
    }

    @Test
    public void testSelectMultiParam(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = dao.selectMultiParam("tommy", 100);
        for(Student stu:studentList){
            System.out.println("-----student:"+stu);
        }
        sqlSession.close();
    }
}
