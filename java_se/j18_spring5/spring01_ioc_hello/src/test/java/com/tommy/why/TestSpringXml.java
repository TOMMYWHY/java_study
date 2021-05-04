package com.tommy.why;

import com.tommy.why.controller.GoodsController;
import com.tommy.why.dao.GoodsDao;
import com.tommy.why.factory.StaticFactory;
import com.tommy.why.service.IGoodsService;
import com.tommy.why.service.IOrderService;
import com.tommy.why.service.impl.IGoodsServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class TestSpringXml {

    @Test
    public void test01_import(){
        BeanFactory factory = new ClassPathXmlApplicationContext("beans-all.xml");
        IGoodsService goodsService = factory.getBean("goodsService", IGoodsService.class);
         GoodsDao goodsDao = factory.getBean("goodsDao", GoodsDao.class);
        GoodsController goodsController = factory.getBean("goodsController", GoodsController.class);
        assertNotNull(goodsService);
        assertNotNull(goodsDao);
        assertNotNull(goodsController);

    }

    @Test
    public void test02_constructor(){
        BeanFactory factory = new ClassPathXmlApplicationContext("beans-all.xml");
        IGoodsService goodsService = factory.getBean("goodsService", IGoodsService.class);

    }

    @Test
    public void test03_StaticFactory(){
        BeanFactory factory = new ClassPathXmlApplicationContext("beans-factory.xml");
        IOrderService orderService = factory.getBean("orderService", IOrderService.class);
        assertNotNull(orderService);
        System.out.println(orderService);//com.tommy.why.service.impl.IOrderServiceImpl@cb51256

    }


    @Test
    public void test04_InstanceFactory(){
        BeanFactory factory = new ClassPathXmlApplicationContext("beans-factory.xml");
        IOrderService orderService = factory.getBean("orderService2", IOrderService.class);
        assertNotNull(orderService);
        System.out.println(orderService);//com.tommy.why.service.impl.IOrderServiceImpl@12cdcf4


    }


    @Test
    public void test05_di(){
        BeanFactory factory = new ClassPathXmlApplicationContext("beans-di.xml");
        IGoodsServiceImpl iGoodsService = factory.getBean("goodsService", IGoodsServiceImpl.class);
        assertNotNull(iGoodsService);
        System.out.println(iGoodsService);
        GoodsDao goodsDao = iGoodsService.getGoodsDao();
        assertNotNull(goodsDao);
        System.out.println(goodsDao);


    }
}
