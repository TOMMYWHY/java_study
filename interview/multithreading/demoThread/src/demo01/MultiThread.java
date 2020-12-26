package demo01;

public class MultiThread  implements Runnable{

    private int ticketNum = 20;
    @Override
    public void run() {
        while (true){
            if(ticketNum <= 0){break;}
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " get "+ ticketNum--);
        }
    }

    public static void main(String[] args) {
        MultiThread ticket = new MultiThread();
        new Thread(ticket,"aaa").start();
        new Thread(ticket,"bbb").start();
        new Thread(ticket,"ccc").start();
    }
}
