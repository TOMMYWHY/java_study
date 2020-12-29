package com.tommy.why;

import static org.junit.Assert.assertTrue;

import com.tommy.why.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void test01()
    {
        String springConfig = "spring.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springConfig);

//        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("/Users/Tommy/Desktop/studyInMassey/Java_study/java_se/j13_spring/springDemo01/src/main/resources/spring.xml");

        UserService userService =(UserService) applicationContext.getBean("userService");
//        userService.test();
    }

    @Test
    public void test02(){
        String springConfig = "spring02.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(springConfig);

        UserService userService =(UserService) applicationContext.getBean("userService");
        userService.test();

    }
}
