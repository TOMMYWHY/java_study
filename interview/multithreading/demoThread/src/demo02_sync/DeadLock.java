package demo02_sync;

public class DeadLock {

    public static void main(String[] args) {
        Makeup makeup0 = new Makeup(0,"aaa");
        Makeup makeup1= new Makeup(1,"bbb");

        makeup0.start();
        makeup1.start();
        System.out.println("done");
    }

}

class Lipstick {}

class Mirror{}


class Makeup extends Thread{
    static  Lipstick lipstick = new Lipstick();
    static  Mirror mirror = new Mirror();
    int choice;
    String girlName;

    Makeup(    int choice,     String girlName){
        this.choice = choice;
        this.girlName = girlName;
    }

    @Override
    public void run() {
        try {
            this.makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private  void makeup () throws InterruptedException {
        if(choice == 0){
            //get lock
            synchronized (lipstick){
                System.out.println(this.girlName + " get lipstick lock~");
                Thread.sleep(1000);

                /*synchronized (mirror){
                    System.out.println(this.girlName + " get mirror lock~~~~~");
                }*/
            }
            synchronized (mirror){
                System.out.println(this.girlName + " get mirror lock~~~~~");
            }
        }else {
            synchronized (mirror){
                System.out.println(this.girlName + " get mirror lock=");
                Thread.sleep(2000);
/*
                synchronized (lipstick){
                    System.out.println(this.girlName + " get lipstick lock====");
                }*/
            }

            synchronized (lipstick){
                System.out.println(this.girlName + " get lipstick lock====");
            }

        }
    }
}
