package com.tommy.why;

public class HelloMaven {
    public int add (int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        HelloMaven helloMaven = new HelloMaven();
        int result = helloMaven.add(2,3);
        System.out.println("result:"+result);
    }
}
