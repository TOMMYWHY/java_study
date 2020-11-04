package com.j_se.demo11_polymorphism;


public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

//        Mouse mouse = new Mouse();
//        USB usb = mouse;
        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        System.out.println("==========");

        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard); // 自动类型转换

        computer.powerOff();
    }
}
