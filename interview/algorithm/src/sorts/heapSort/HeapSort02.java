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
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr,i);
        }
        int heap_size = arr.length;

//        swap(arr,0,--heap_size);
        heap_size--;
        swap(arr,0,heap_size);
        while(heap_size>0){
            heapify(arr,0,heap_size);
            heap_size--;
            swap(arr,0,heap_size);
        }
    }



    private void heapify(int[] arr, int index, int heapSize) {
        int l_son = index*2+1;
//        int r_son = index*2+2;
        int r_son = l_son+1;
        int largeset = -1;
        while (l_son<heapSize){
            if(l_son+1<heapSize && arr[l_son]<arr[r_son]){
                largeset = r_son;
            }else{
                largeset = l_son;
            }
            if(arr[largeset]<arr[index]){
                largeset= index;
            }
            if(largeset == index){break;}
            swap(arr,largeset,index);
            index = largeset;
            l_son = index *2+1;
//            r_son = index *2+2;
        }

    }

    private void heapInsert(int[] arr, int index) {
//        int p_index = (index-1)/2;
        while (arr[index]>arr[(index-1)/2]){
            swap(arr,index,(index-1)/2);
             index = (index-1)/2;
        }
    }
}
