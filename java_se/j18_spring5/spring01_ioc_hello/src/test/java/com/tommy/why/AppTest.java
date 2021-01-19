package com.tommy.why;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.tommy.why.service.IGoodsService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test01_hello(){
        BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
        IGoodsService goodsService = (IGoodsService)factory.getBean("goodsService");
        assertNotNull(goodsService);
    }
}
