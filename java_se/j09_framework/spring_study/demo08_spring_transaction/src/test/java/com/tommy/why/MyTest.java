package com.tommy.why;

import com.tommy.why.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01(){
        String config = "applicationContext.xml";

        ApplicationContext ctx =  new ClassPathXmlApplicationContext(config);
        BuyGoodsService buyGoodsService =(BuyGoodsService) ctx.getBean("BuyGoodsService");
        System.out.println("service:"+ buyGoodsService);
        buyGoodsService.buy(1,13);
//        buyGoodsService.buy(10,10);
//        buyGoodsService.buy(1,  200);


    }
}
