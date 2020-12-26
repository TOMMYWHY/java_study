package demo01;

public class TestJoin implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 400; i++) {
            System.out.println("vip..... " + i);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        TestJoin myJoin = new TestJoin();
        Thread thread = new Thread(myJoin);
        thread.start();
        for (int i = 0; i < 1000; i++) {
            if(i == 200){
                thread.join();
            }
            System.out.println("main "+ i);
        }
    }
}


