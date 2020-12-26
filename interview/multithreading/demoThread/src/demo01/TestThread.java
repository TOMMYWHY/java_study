package demo01;

public class TestThread extends Thread{
    @Override
    public void run() {
//        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println("aaaaa"+i);
        }
    }

    public static void main(String[] args) {

        TestThread testThread = new TestThread();
//        testThread.start();//并行
        testThread.run();//顺序执行

        for (int i = 0; i < 10; i++) {
            System.out.println("main...."+i);
        }

    }
}
