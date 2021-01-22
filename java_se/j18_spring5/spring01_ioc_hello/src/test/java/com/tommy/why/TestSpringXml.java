package com.tommy.why;

import com.tommy.why.controller.GoodsController;
import com.tommy.why.dao.GoodsDao;
import com.tommy.why.service.IGoodsService;
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
}
