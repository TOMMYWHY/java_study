package com.j_se2.demo06_thread;

public class Demo06Thread {
    public static void main(String[] args) {
        /*Person p1 = new Person("tommy");
        p1.run();
        Person p2 = new Person("mark");
        p2.run();*/
        SelfThread mt = new SelfThread();
        mt.start(); //开启
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }
}
