package com.tommy.why.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
//@Aspect
public class LogAnnotationProxy {
    @Pointcut("execution(* com.tommy.why.pay.*.*(..))")
    public void cut(){}

 /*   @Before(value="cut()")
    public void before(){
        System.out.println("before....");
    }

    @After(value = "cut()")
    public void after(){
        System.out.println("aaaafter....");
    }

    @AfterReturning(value = "cut()")
    public void afterReturn(){
        System.out.println("aaaafter return....");
    }

    @AfterThrowing(value = "cut()")
    public void afterThrow(){
        System.out.println("aaaafter throw....");
    }

*/
    @Around(value="cut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("1111");

        System.out.println(pjp.getTarget());
        System.out.println(pjp.getSignature());
        System.out.println(pjp.getThis());
        System.out.println(pjp.getSourceLocation());

        Object proceed = pjp.proceed();

        System.out.println("2222");
        return proceed;
    }
}
