package com.tommy.why.service.impl;

import com.tommy.why.service.SomeService;
import com.tommy.why.util.ServiceTools;

import java.util.Date;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
//        ServiceTools.doLog();
        System.out.println("do some execute...");

//        ServiceTools.doTrans();
    }

    @Override
    public void doOther() {
//        ServiceTools.doLog();
        System.out.println("do other execute...");
//        ServiceTools.doTrans();

    }
}
