package sorts.quickSort;

import org.junit.Test;

import java.util.Arrays;

public class QuickSort7 {
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

    private void quickSort(int[] arr, int l, int r) {
        if(l>=r)return;
        int pivot = partition(arr,l,r);
        quickSort(arr,l,pivot-1);
        quickSort(arr,pivot,r);
    }

    private int partition(int[] arr, int l, int r) {
        int less = l-1, more = r; //index = l ; pivot = r
        while(l<more){
            if(arr[l]<arr[r]){
                swap(arr,less+1,l);
                less++;
                l++;
            }else if(arr[l]>arr[r]){
                swap(arr, more-1,l);
                more--;
            }else{
                l++;
            }
        }
        swap(arr,r,more);
        return more;
    }
}
