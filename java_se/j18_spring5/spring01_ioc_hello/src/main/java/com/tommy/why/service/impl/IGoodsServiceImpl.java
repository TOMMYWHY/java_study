package com.tommy.why.service.impl;

import com.tommy.why.dao.GoodsDao;
import com.tommy.why.service.IGoodsService;

public class IGoodsServiceImpl implements IGoodsService {
    private String host;
    private GoodsDao goodsDao;

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    public GoodsDao getGoodsDao() {
        return goodsDao;
    }

    public IGoodsServiceImpl() {
    }

    public IGoodsServiceImpl(String host) {
        this.host = host;
    }
}
