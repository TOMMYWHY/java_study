package com.tommy.why.factory;

import com.tommy.why.service.IOrderService;
import com.tommy.why.service.impl.IOrderServiceImpl;

public class StaticFactory {
    public static IOrderService iOrderService = new IOrderServiceImpl();;

    private StaticFactory() {
    }

    public static IOrderService createInstance(){
         return  iOrderService;
    }
}
