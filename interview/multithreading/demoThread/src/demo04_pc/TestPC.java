package demo04_pc;

public class TestPC {
    public static void main(String[] args) {
        SyncContainer syncContainer = new SyncContainer();

        Producer producer = new Producer(syncContainer);
        producer.start();
        Customer customer = new Customer(syncContainer);
        customer.start();

    }

}

class Producer extends Thread{
    SyncContainer container;
    public Producer(SyncContainer container){
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            container.push(new Chicken(i));
            System.out.println("product chicken :" + i);
        }
    }
}


class Customer extends Thread{
    SyncContainer container;
    public Customer(SyncContainer container){
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Chicken chicken = container.pop();
            System.out.println("consume chicken ： " + chicken.id);

        }
    }
}

class Chicken{
    int id;

    public Chicken(int id) {
        this.id = id;
    }

}

class SyncContainer{
    Chicken[] chickens =  new Chicken[10];
    int count = 0;
    public synchronized void push(Chicken chicken){
        if(count == chickens.length){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        chickens[count] = chicken;
        count ++;
        this.notifyAll();

    }
    public synchronized Chicken pop(){
        if(count == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count --;
        Chicken chicken =  chickens[count];
        this.notifyAll();

        return chicken;
    }

}