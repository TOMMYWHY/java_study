package com.j_se2.demo06_thread;

public class SelfThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName());
        for (int i = 0; i < 20; i++) {
            System.out.println("running:"+i);
        }
    }
}
