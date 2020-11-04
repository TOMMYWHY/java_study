package com.j_se.demo11_polymorphism;

public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("Keyboard open");
    }

    @Override
    public void close() {
        System.out.println("Keyboard close");

    }
}
