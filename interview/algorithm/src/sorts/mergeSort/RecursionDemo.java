package sorts.mergeSort;

import org.junit.Test;

public class RecursionDemo {
    static long f(int n){
        if(n<1){
            return -1;
        }
        if(n==1){
            return 1;
        }
        return  n+f(n-1);
    }

    @Test
    public void test(){
        System.out.println(f(10));
    }

    public static int getMax(int[] arr){
        return process(arr,0,arr.length-1);
    }

    private static int process(int[] arr, int L, int R) {
        if(L==R){return  arr[L];}
//        int mid = (L+R)/2;
//        int mid = (L+ (R-L))/2;
        int mid = (L + (R-L)/2 );

        int leftMax = process(arr,L,mid);
        int rightMax = process(arr,mid+1,R);
        return Math.max(leftMax,rightMax);
    }
    @Test
    public void test01(){
        int[] arr = {1,2,13,4,25,6,9,8};
        System.out.println(getMax(arr));
    }
}
