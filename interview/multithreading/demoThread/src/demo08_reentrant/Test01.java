package demo08_reentrant;

public class Test01 {
    public synchronized void sm1(){
        System.out.println("sm1...");
        sm2();
    }
    private synchronized void sm2(){
        System.out.println("sm2...");
        sm1();
    }


    public static void main(String[] args) {
        Test01 obj = new Test01();
        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.sm1(); // 死锁

            }
        }).start();
    }
}
