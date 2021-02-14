package sorts.bubbleSort;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSort {

    private static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }

    public static void BubbleSort(int[] arr){
        for (int end = arr.length-1; end >0; end--) {
            for (int i = 0; i < end; i++) {
                if(arr[i]> arr[i+1]){
                    swap(arr,i,i+1);
                }

            }
        }
    }

    public void bubbleSort00(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr, j , j+1);
                }

            }
        }
    }
    public void bubbleSort01(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }

        }
    }
    public void bubbleSort02(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i -1; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr, arr[j],arr[j+1]);
                }
            }
        }
    }
    public void bubbleSort03(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }

            }

        }
    }
    public void bubbleSort04(int[] arr){
        for (int i = arr.length-1; i > 0; i--){
            for (int j = 0; j < i; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr, j ,j+1);
                }
            }
        }
    }
    public void bubbleSort05(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr, j ,j+1);
                }
            }
        }
    }
    public void bubbleSort06(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }

            }

        }
    }


    @Test
    public void test(){
        int [] a = {3,2,4,7,6,1};
        bubbleSort06(a);
        System.out.println(Arrays.toString(a));
    }


}
