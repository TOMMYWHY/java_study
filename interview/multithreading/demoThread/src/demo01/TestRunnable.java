package demo01;

public class TestRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            System.out.println(i + " TestRunnable....");
        }
    }

    public static void main(String[] args) {
        TestRunnable testRunnable = new TestRunnable();
        new Thread(testRunnable).start();
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "main....");
        }
    }
}
