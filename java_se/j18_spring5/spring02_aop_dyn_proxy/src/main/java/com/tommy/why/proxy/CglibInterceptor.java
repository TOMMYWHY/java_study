package com.tommy.why.proxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CglibInterceptor implements MethodInterceptor {

    private Object target;

    public CglibInterceptor(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public void before(){
        System.out.println("before:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
    }
    public void after(){
        System.out.println("after:"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));

    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invoke(target, objects);
        after();
        return result;
    }
}
