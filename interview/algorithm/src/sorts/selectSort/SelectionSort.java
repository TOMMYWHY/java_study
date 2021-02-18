package sorts.selectSort;

import org.junit.Test;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        if(arr==null || arr.length<2){
            return;
        }

        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
//                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    public  void selectSort00(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            swap(arr, i, min);

        }
    }
    public  void selectSort01(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min  = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            swap(arr,min,i);
        }
    }
    public  void selectSort02(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            swap(arr,min,i);

        }
    }
    public  void selectSort03(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            swap(arr,min,i);
        }
    }
    public  void selectSort04(int[] arr){

        for (int i = 0; i < arr.length-1; i++) { // -1
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }
    public  void selectSort05(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }
    public  void selectSort06(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }

            }
            swap(arr,i,min);

        }
    }
    public  void selectSort07(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){min=j;}

            }
            swap(arr,min,i);
        }
    }
    public  void selectSort08(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }
    public  void selectSort09(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }
    public  void selectSort10(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                min = j;
            }
            swap(arr,i,min);
        }
    }

    private static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }


    @Test
    public void test(){
        int arr[] = {3,2,1,4,5,17,8};
        selectSort10(arr);
        System.out.println(Arrays.toString(arr));
    }


}
