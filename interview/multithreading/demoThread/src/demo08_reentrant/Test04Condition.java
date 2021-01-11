package demo08_reentrant;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test04Condition {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();

    static class SubThread extends Thread{
        @Override
        public void run() {
            try {
                lock.lock();
                System.out.println("lock...");
                condition.await();
                System.out.println("awaiting......");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println("unlocked");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SubThread subThread = new SubThread();
        subThread.start();

        Thread.sleep(2000);
        try {
            lock.lock();
            condition.signal();

        }finally {
            lock.unlock();
        }
    }
}
