package sorts.quickSort;

import org.junit.Test;

import java.util.Arrays;

public class QuickSort2 {
    private static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }

    @Test
    public void test(){
        int[] arr = {7,3,2,8,1,9,5,4,6,0};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int l,int r){
        if(l<r){
            swap(arr,l+(int)(Math.random()*(r-l+1)),r);
            int[] p = partition(arr,l,r);
            quickSort(arr,l,p[0]-1);
            quickSort(arr,p[1]+1,r);
        }
    }

    private static int[] partition(int[] arr, int l, int r) {
        int less = l-1;
        int more = r;
        while(l<more){
            if(arr[l]<arr[r]){
//                swap(arr,++less,l++);
                swap(arr,l, less+1);
                less++;
                l++;

            }else if(arr[l]>arr[r]){
//                swap(arr,--more,l);
                swap(arr, more-1,l);
                more--;

            }else{
                l++;
            }
        }
        swap(arr,more,r);
        return new int[]{less+1,more};
    }


}
