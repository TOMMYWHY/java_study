package demo08_reentrant;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Test03 {

    static class TimeLock implements Runnable{

        private static ReentrantLock lock = new ReentrantLock();

        @Override
        public void run() {
            try {
                if(lock.tryLock(3, TimeUnit.SECONDS)){
                    System.out.println(Thread.currentThread().getName()+"---get lock");
                    Thread.sleep(4000);
                }else {
                    System.out.println(Thread.currentThread().getName() + "--- didnot get lock");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if(lock.isHeldByCurrentThread()){
                    lock.unlock();
                }
            }
        }
    }
    public static void main(String[] args) {
        TimeLock timeLock = new TimeLock();
        Thread t1 = new Thread(timeLock);
        Thread t2 = new Thread(timeLock);
        t1.start();
        t2.start();
    }

}
