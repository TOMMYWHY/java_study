package com.tommy.why.factory;

import com.tommy.why.service.IOrderService;
import com.tommy.why.service.impl.IOrderServiceImpl;

public class InstanceFactory {
    public static IOrderService iOrderService = new IOrderServiceImpl();;


    public  IOrderService createInstance(){
        return  iOrderService;
    }
}
