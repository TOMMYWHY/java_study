package leetcode.swap;

import org.junit.Test;

import java.util.Arrays;

public class Swap {
    public static void swap_arr(int[] arr,int a , int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }

    @Test
    public void test(){
        int a = 99;
        int b = 11;

//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
        int[] arr ={3,1,1111};
        swap_arr(arr,0,2);
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
        System.out.println(Arrays.toString(arr));
    }
}
