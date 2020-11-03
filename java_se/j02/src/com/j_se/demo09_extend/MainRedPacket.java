package com.j_se.demo09_extend;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("master",100);
        Member member1 = new Member("1",0);
        Member member2 = new Member("2",0);
        Member member3 = new Member("3",0);
        manager.show();
        member1.show();
        member2.show();
        member3.show();

        ArrayList<Integer> redList = manager.send(20,3);
        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);
        System.out.println("-----");
        manager.show();
        member1.show();
        member2.show();
        member3.show();

    }

}
