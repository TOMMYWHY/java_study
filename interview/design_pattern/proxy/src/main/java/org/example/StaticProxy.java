package org.example;


interface FindHouse{
    public void find();
}

class You implements FindHouse{

    @Override
    public void find() {
        System.out.println("checkin....");
    }
}

class Proxy implements FindHouse{
    private FindHouse findHouse;
    public Proxy(FindHouse findHouse) {
        this.findHouse = findHouse;
    }

    @Override
    public void find() {
        System.out.println("finding...house....");
        findHouse.find(); //find -> You.find()
        System.out.println("earn money~!");
    }
}


public class StaticProxy {
    public static void main(String[] args) {
        You you = new You();
        Proxy proxy = new Proxy(you);
        proxy.find();
    }

}
