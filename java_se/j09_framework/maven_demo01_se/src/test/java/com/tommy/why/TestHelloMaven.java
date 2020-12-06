package com.tommy.why;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {

    @Test
    public  void testAdd(){
        System.out.println("---test add ----");
        HelloMaven helloMaven = new HelloMaven();
        int result = helloMaven.add(11,12);
        Assert.assertEquals(result,23);
    }

}
