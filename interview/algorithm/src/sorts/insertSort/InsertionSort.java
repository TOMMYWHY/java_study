package sorts.insertSort;

import org.junit.Test;

import java.util.Arrays;

public class InsertionSort {

    private static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }
    public static void InsertionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) { // int i = 1
            for (int j = i-1; j >=0; j--) {
                if(arr[j]>arr[j+1]){ // 此处不能用 i, 因为 i 在上层，j变换后 i不变。所以要用j + 1
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public void insertSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(arr[j]> arr[j+1]){
                    swap(arr,j,j+1);
                }
            }

        }
    }

    public void insertSort01(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    @Test
    public void test(){
//        InsertionSort insertionSort = new InsertionSort();
        int [] a = {3,2,4,7,6,11};
//        InsertionSort(a);
        insertSort01(a);
        System.out.println(Arrays.toString(a));
    }
}
