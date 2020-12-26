package demo02_sync;

public class UnSaveTicket {

    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket, "a").start();
        new Thread(buyTicket, "b").start();
        new Thread(buyTicket, "c").start();
        new Thread(buyTicket, "d").start();
    }
}


class BuyTicket implements Runnable{

    private int  ticketNum = 10;
    private boolean flag = true;
    @Override
    public  void run() {
        while (flag){
            try {
                Thread.sleep(100);
                this.buy();
            } catch (InterruptedException e) {

            }
        }
    }

    private synchronized  void buy() throws InterruptedException {
        if(this.ticketNum <=0){
            flag = false;
            return;
        }
//        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName() + " get ticket " + ticketNum--);

    }
}