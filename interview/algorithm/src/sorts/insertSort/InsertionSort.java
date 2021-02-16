package sorts.insertSort;

import org.junit.Test;

import java.util.Arrays;

public class InsertionSort {

    private static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }

    /*
    * 希尔排序 不稳定*/
    public void shellSort(int arr[]){
        for (int gap = 4; gap >0; gap/=2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j >gap-1; j=j-gap) {
                    if(arr[j-gap] > arr[j]){
                        swap(arr,j,j-gap);
                    }
                }
            }
        }
    }
    public void shellSort00(int arr[]){
        for (int gap = arr.length/2; gap >0; gap/=2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j >gap-1; j=j-gap) {
                    if(arr[j-gap] > arr[j]){
                        swap(arr,j,j-gap);
                    }
                }
            }
        }
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
    public void insertSort02(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0 ; j--) {
                if(arr[j]> arr[j-1]){
                    swap(arr, arr[j],arr[j- 1]);
                };
            }
        }
    }
    public void insertSort03(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0; j--) {
                if(arr[j-1] > arr[j]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    public void insertSort04(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0; j--) {
                if(arr[j]>arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    public void insertSort05(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0; j--) {
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }

        }
    }
    public void insertSort06(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }
    }
    public void insertSort07(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j-1]>arr[j]){swap(arr,j-1,j);}

            }

        }
    }

    @Test
    public void test(){
//        InsertionSort insertionSort = new InsertionSort();
        int [] a = {3,2,4,7,6,11};
//        InsertionSort(a);
//        insertSort01(a);
        insertSort07(a);
//        shellSort(a);
        System.out.println(Arrays.toString(a));
    }
}
