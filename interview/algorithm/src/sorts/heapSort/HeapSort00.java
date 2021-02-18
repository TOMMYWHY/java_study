package sorts.heapSort;

import org.junit.Test;

import java.util.Arrays;

public class HeapSort00 {
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

        int heapSize= arr.length;
//        heapSize--;
//        swap(arr,0,heapSize);
        swap(arr,0,--heapSize); // 交换后最后一位 为最大值，并排除树外

        while (heapSize>0){
            heapify(arr,0,heapSize);
//            heapSize--;
//            swap(arr,0,heapSize);
            swap(arr,0,--heapSize); //最后一位 为最大值，并排除树外

        }

    }



    private void heapify(int[] arr, int index, int heapSize) {
        int left_son = index * 2 +1;
//        int right_son = index * 2 +2;
        int right_son = left_son +1;
        int largest = -1;
        while (left_son < heapSize){
            if(right_son<heapSize && arr[right_son] > arr[left_son]){
                largest = right_son;
            }else {
                largest = left_son;
            }
            if(arr[largest]<arr[index]){
                largest = index;
            }
            if(largest == index){break;} // 父节点最大，完成
            swap(arr,largest,index);
            /*重置*/
            index = largest;
            left_son = index * 2 +1;
//            right_son = index * 2 +2;
        }
    }

    private void heapInsert(int[] arr, int index) {
        int parent_index = (index-1)/2;
        while (arr[index]>arr[parent_index]){
            swap(arr,index,parent_index);
            index = parent_index;
        }
    }
}
