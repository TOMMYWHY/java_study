package com.tommy.why.pay;


import org.springframework.stereotype.Component;

@Component
public class RmbPay implements Pay {
    @Override
    public void pay() {
        System.out.println("rmb....");
    }
}
