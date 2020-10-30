package com.j_se.demo07_string;

import java.util.Arrays;

public class Static_arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        String intStr = Arrays.toString(intArray); //int[] ==> string
        System.out.println(intStr);


        int[] arr1 = {101,20,30};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

    }
}
