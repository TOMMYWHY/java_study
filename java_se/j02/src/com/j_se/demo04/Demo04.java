package com.j_se.demo04;

//over load
public class Demo04 {
    public static void main(String[] args) {
//        sum(1,2);
//        sum(1,2,3);

//        int[] arr = new int[3];
//        int[] arr = new int[] {1,2,3,4};
        int[] arr = {0,1,2,3,4};
//        int[10] arr = {1}; //err
        System.out.println(arr.length);
        System.out.println(arr);

    }

    private static void sum(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    private static void sum(int a, int b) {
        System.out.println(a+b);
    }

}
