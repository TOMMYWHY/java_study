package com.tommy.why.ba01;

import org.aspectj.lang.JoinPoint;
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
    public void myBefore(JoinPoint jp){

        System.out.println("4 before---: "+ new Date());


        System.out.println("class defined:"+jp.getSignature());
        System.out.println("fun name:"+jp.getSignature().getName());
        Object[] args = jp.getArgs();
        for (Object arg: args){
            System.out.println("fun params:"+arg);
        }

    }
}




