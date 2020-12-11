package com.tommy.why;

//import com.tommy.why.ba01.Student;
//import com.tommy.why.ba02.Student;
import com.tommy.why.ba03.Student;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {

    @Test
    public void test_ba01(){
        String config = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student =(Student) ac.getBean("myStudent");
        System.out.println("student:"+student);
    }

    @Test
    public void test_ba02(){
        String config = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student =(Student) ac.getBean("myStudent");
        System.out.println("student:"+student);
    }

    @Test
    public void test_ba03(){
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student =(Student) ac.getBean("myStudent");
        System.out.println("student:"+student);
    }



}
