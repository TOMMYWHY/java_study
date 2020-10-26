package com.structures.LinkedList;

import java.util.LinkedList;
/*
* 链表 查询慢，增删快
* 无索引
* */
public class Demo01 {
    public static void main(String[] args) {
        testLinkedList();
    }
    public static void testLinkedList(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);//[a, b, c]
        list.addFirst("zzz");
        list.removeLast();
        System.out.println(list.getFirst());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+", ");
        }
    }
}
