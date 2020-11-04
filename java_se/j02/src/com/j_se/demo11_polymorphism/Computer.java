package com.j_se.demo11_polymorphism;

public class Computer {
    public void powerOn(){
        System.out.println("PC on");
    }
    public void powerOff(){
        System.out.println("PC off");
    }
    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof  Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }else if(usb instanceof  Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.type();
        }
        usb.close();
    }
}
