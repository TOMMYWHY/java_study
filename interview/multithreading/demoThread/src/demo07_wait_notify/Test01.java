package demo07_wait_notify;

import org.junit.jupiter.api.Test;

public class Test01 {

    @Test
    public  void  testWait() {
        String text = "tommy";
        try {
//            text.wait(); //IllegalMonitorStateException
            System.out.println("before sync。。。");
            synchronized (text){
                System.out.println("in sync---");
                text.wait();
                System.out.println("after wait");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ending");
    }

    @Test
    public void TestNotify() throws InterruptedException {
        String lock = "tommy";

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    System.out.println("t1 waiting..." + System.currentTimeMillis() );
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("t1 finish waiting..." + System.currentTimeMillis() );

                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    System.out.println("t2 weakup..." + System.currentTimeMillis());
                    lock.notify();
                    System.out.println("t2 finish weakup..." + System.currentTimeMillis() );

                }
            }
        });

        t1.start();
        Thread.sleep(2000);
        t2.start();

    }
}
