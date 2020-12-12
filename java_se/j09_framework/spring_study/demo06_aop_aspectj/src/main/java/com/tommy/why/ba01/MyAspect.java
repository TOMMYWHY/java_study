package com.tommy.why.ba01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class MyAspect {
//    @Before(value = "execution(public void com.tommy.why.ba01.SomeServiceImpl.doSome(String , Integer ))")
//    public void myBefore(){
//        System.out.println("before---: "+ new Date());
//    }


//    @Before(value = "execution( * *..SomeServiceImpl.doSome(.. ))")
//    public void myBefore(){
//        System.out.println("3 before---: "+ new Date());
//    }

    @Before(value = "execution( * *..SomeServiceImpl.d*(.. ))")
    public void myBefore(){
        System.out.println("4 before---: "+ new Date());
    }
}




