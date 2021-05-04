package com.tommy.why;

import com.tommy.why.pay.Pay;
import com.tommy.why.pay.RmbPay;
import com.tommy.why.proxy.CglibInterceptor;
import com.tommy.why.proxy.MyjdkHandler;

public class Starter {
    public static void main(String[] args) {
        RmbPay rmbPay = new RmbPay();
        rmbPay.pay();
        System.out.println("--------");

        MyjdkHandler myjdkHandler = new MyjdkHandler(rmbPay);
        Pay rmbProxy = (Pay) myjdkHandler.getProxy();
        rmbProxy.pay();

        System.out.println("--------");

        CglibInterceptor cglibInterceptor = new CglibInterceptor(rmbPay);
        Pay proxyInstance = (Pay)cglibInterceptor.getProxyInstance();
        proxyInstance.pay();

        System.out.println("--------");
        TestService testService = new TestService();
        CglibInterceptor cglibInterceptor2 = new CglibInterceptor(testService);
        testService =(TestService) cglibInterceptor2.getProxyInstance();
        testService.test();
    }
}
