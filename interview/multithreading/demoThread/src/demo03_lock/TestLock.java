package demo03_lock;

import java.util.concurrent.locks.ReentrantLock;

public class TestLock {

    public static void main(String[] args) {
        TestLock2 testlock2 = new TestLock2();
        new Thread(testlock2,"a").start();
        new Thread(testlock2,"b").start();
        new Thread(testlock2,"c").start();

    }
}

class TestLock2 implements Runnable{

    private int ticketNums = 1000;

    private  final  ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true){
            try{
                lock.lock();
                if(ticketNums <= 0){break;}
                else {
                    /*try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    System.out.println( Thread.currentThread().getName() +  " ticketNums: " + ticketNums--);
                }

            }finally {
                lock.unlock();
            }

        }
    }
}
