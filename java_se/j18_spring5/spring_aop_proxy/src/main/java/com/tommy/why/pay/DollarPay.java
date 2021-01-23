package com.tommy.why.pay;


import org.springframework.stereotype.Component;

@Component
public class DollarPay implements Pay {
    @Override
    public void pay() {
        System.out.println("dollar....");
    }
}
