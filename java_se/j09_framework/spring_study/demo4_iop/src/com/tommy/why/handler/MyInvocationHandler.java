package com.tommy.why.handler;

import com.tommy.why.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private  Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object res = null;
        ServiceTools.doLog();
        res = method.invoke(target,args);
        ServiceTools.doTrans();
        return res;
    }
}
