package com.tommy.why.service.impl;

import com.tommy.why.dao.GoodsDao;
import com.tommy.why.dao.SaleDao;
import com.tommy.why.entity.Goods;
import com.tommy.why.entity.Sale;
import com.tommy.why.excep.NotEnoughException;
import com.tommy.why.service.BuyGoodsService;

public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;

    @Override
    public void buy(Integer goodsId, Integer nums) {
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null){
            throw new NullPointerException("gid:"+ goodsId + "not exit~!");
        }else if(goods.getAmount() < nums){
            throw new NotEnoughException("gid:"+ goodsId + "not enough~!");
        }
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);

        goodsDao.updateGoods(buyGoods);
        System.out.println("----buy gid:"+goodsId + ", " + nums);

    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
