package com.j_se.demo09_extend;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalMoney, int count){
        ArrayList<Integer> redList =new ArrayList<>();
        int leftMoney = super.getMoney();
        if(totalMoney > leftMoney){
            System.out.println("not enough");
            return  redList;
        }
        super.setMoney(leftMoney-totalMoney);

        int avg = totalMoney/count;
        int mod = totalMoney%count;
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        int last = avg+mod;
        redList.add(last);
        return redList;
    }

}
