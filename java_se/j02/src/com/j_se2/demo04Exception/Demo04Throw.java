package com.j_se2.demo04Exception;

public class Demo04Throw {
    public static void main(String[] args) {
        int [] arr = null;
        int e = getElement(arr, 0);
        System.out.println(e);
    }
    public static int getElement(int[] arr,int index){
        if (arr == null){
            throw new NullPointerException("-NullPointerException-");
        }
        int ele = arr[index];
        return ele;
    }
}
