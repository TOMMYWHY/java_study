package com.tommy.why.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyjdkHandler implements InvocationHandler {
    private Object target;

    public MyjdkHandler(Object target) {
        this.target = target;
    }

    public MyjdkHandler() {

    }

    public Object getProxy(){
        return  Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    public void before(){
        System.out.println("before:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
    }
    public void after(){
        System.out.println("after:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));

    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }
}
