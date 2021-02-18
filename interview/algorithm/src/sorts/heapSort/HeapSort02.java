package sorts.heapSort;

import org.junit.Test;

import java.util.Arrays;

public class HeapSort02 {
    private static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }

    @Test
    public void test(){
        int[] arr = {7,3,2,8,1,9,5,4,6,0};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void heapSort(int[] arr) {
        if(arr==null || arr.length<2){return;}

    }



    private void heapify(int[] arr, int index, int heapSize) {

    }

    private void heapInsert(int[] arr, int index) {

    }
}
