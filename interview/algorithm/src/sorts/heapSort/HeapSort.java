package sorts.heapSort;

import org.junit.Test;

import java.util.Arrays;

public class HeapSort {

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
        /*for (int i = 0; i < arr.length; i++) {
            heapInsert(arr,i);// 将arr 改为大顶堆
        }*/

        for (int i =  arr.length-1; i>=0;i--) {
            heapify(arr,i,arr.length);
        }

        int heapSize= arr.length;
        swap(arr,0,--heapSize); // 最后一位 为最大值，并排除树外
        while (heapSize>0){
            heapify(arr,0,heapSize); // 将树顶值进行修正。
            swap(arr,0,--heapSize); //最后一位 为最大值，并排除树外
        }
    }



    private void heapInsert(int[] arr, int index) {
        while (arr[index]> arr[(index-1)/2]) {
            swap(arr,index,(index-1)/2);// 当前index 与 父交换
            index = (index-1)/2;
        }
    }

    private void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1; //左子树
        while(left < heapSize){
            //right = left+1
            int largest = left+1 < heapSize &&
                    arr[left+1] > arr[left] ? left+1 : left;
            largest = arr[largest]>arr[index] ? largest:index; //子树与父比较
            if(largest == index){break;} // 父节点最大，完成
            swap(arr,largest,index);
            index = largest;
            left = index * 2 +1;
        }
    }
}
