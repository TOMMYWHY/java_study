package com.j_se.demo11_polymorphism;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("mouse open");
    }

    @Override
    public void close() {
        System.out.println("mouse close");

    }

    public void click(){
        System.out.println("mouse click");
    }
}
