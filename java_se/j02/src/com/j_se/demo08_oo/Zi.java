package com.j_se.demo08_oo;

public class Zi extends Fu{
    @Override
    public void override_method() {
        super.override_method();
    }

    String str = "zi";
    public void method(){
        String str="zi method";
        System.out.println(str);//"zi method"
        System.out.println(this.str); // "zi"
        System.out.println(super.str);// "fu"

    }

}
