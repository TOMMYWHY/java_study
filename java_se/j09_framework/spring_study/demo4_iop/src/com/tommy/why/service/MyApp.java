package com.tommy.why.service;

import com.tommy.why.handler.MyInvocationHandler;
import com.tommy.why.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp {

    public static void main(String[] args) {
//        SomeService service = new SomeServiceImpl();
//        service.doSome();
//        System.out.println("-------------------");
//        service.doOther();
//
        SomeService target = new SomeServiceImpl();
        InvocationHandler handler = new MyInvocationHandler(target);
        SomeService proxy = (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler
        );
        proxy.doSome();
    }
}
