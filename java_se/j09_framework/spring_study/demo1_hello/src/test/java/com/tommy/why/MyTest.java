package com.tommy.why;

import com.tommy.why.service.SomeService;
import com.tommy.why.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        SomeService someService = new SomeServiceImpl();
        someService.doSome();
    }

    @Test
    public void test02(){
        String config = "beans.xml";
//        ApplicationContext
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService someService =(SomeService) ac.getBean("someService");
        someService.doSome();
    }
}
