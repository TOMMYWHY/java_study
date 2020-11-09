package com.j_web.demo01_junit.test;


import com.j_web.demo01_junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    @Before
    public void init(){
        System.out.println("...before....");
    }
    @After
    public void close(){
        System.out.println("closed....");
    }

    @Test
    public void testAdd(){
        System.out.println("junit testing...");
        Calculator c = new Calculator();
        int result = c.add(1,2);
//        System.out.println(result);
        Assert.assertEquals(4,result);
    }
}
