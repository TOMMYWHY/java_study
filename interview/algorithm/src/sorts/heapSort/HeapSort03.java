package sorts.heapSort;

import org.junit.Test;

import java.util.Arrays;

public class HeapSort03 {
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
        if(arr == null && arr.length<2){return;}
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr,i);
        }
        int heap_size = arr.length;
        heap_size--;
        swap(arr,0, heap_size);
        while (heap_size>0){
            heapify(arr,0,heap_size);
            heap_size--;
            swap(arr,0,heap_size);
        }

    }



    private void heapify(int[] arr, int index, int heapSize) {
        int lson  = (index*2)+1;
        int rson = lson+1;
        int largest = -1;
        while(lson<heapSize){
            if(arr[lson] < arr[rson] && lson+1<heapSize){
                largest = rson;
            }else {
                largest = lson;
            }
            if(arr[largest] < arr[index]){
                largest = index;
            }
            if(largest==index){return;}
            swap(arr,largest,index);
            index = largest;
            lson=index*2+1;
        }
    }

    private void heapInsert(int[] arr, int index) {
        while (arr[index]>arr[(index-1)/2]){
            swap(arr, index ,(index -1 )/2);
            index =( index -1)/2;
        }
    }
}
