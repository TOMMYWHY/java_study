package com.tommy.why;

import com.tommy.why.pay.Pay;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class Starter {
    public static void main(String[] args) {
//        BeanFactory ac = new ClassPathXmlApplicationContext("spring-aop-01.xml");
//        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-aop-01.xml");
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-aop-02.xml");
        Pay rmbPay = ac.getBean("rmbPay", Pay.class);
        rmbPay.pay();
    }
}
