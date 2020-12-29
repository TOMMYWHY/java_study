package com.tommy.why;

import static org.junit.Assert.assertTrue;

import com.tommy.why.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        UserService userService =(UserService) applicationContext.getBean("userService");
        userService.test();
    }

    @Test
    public void test02(){

    }
}
