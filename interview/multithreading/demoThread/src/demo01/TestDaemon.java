package demo01;

public class TestDaemon {

    public static void main(String[] args) {
        You you = new You();
        God god = new God();

        Thread thread = new Thread(god);
        thread.setDaemon(true);
        thread.start();

        new Thread(you).start();
    }
}

class God implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("god bless you.~!");
        }
    }
}


class You implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("you....");
        }
        System.out.println("dead~！");
    }
}