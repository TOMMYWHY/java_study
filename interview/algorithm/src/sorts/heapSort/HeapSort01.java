package sorts.heapSort;

import org.junit.Test;

import java.util.Arrays;

public class HeapSort01 {
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

        int heapSize = arr.length;
        heapSize--;
        swap(arr,0,heapSize);
        while (heapSize>0){
            heapify(arr,0,heapSize);
            heapSize--;
            swap(arr,0,heapSize);
        }
    }

    private void heapify1(int[] arr, int index, int heapSize) {
        int l_son = index*2+1;
        int r_son = l_son+1;
        int largest = -1;
        while (l_son<heapSize){
            if(l_son+1<heapSize && arr[l_son] < arr[r_son]) {
                largest = r_son;
            }else {
                largest = l_son;
            }
            if(arr[largest]<arr[index]){
                largest = index;
            }
            if(largest == index){break;}
            swap(arr,largest,index);
            index = largest;
            l_son = index*2+1;
//            r_son = l_son+1;
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

    private void heapInsert00(int[] arr, int index) {
        while (arr[index]> arr[(index-1)/2]) {
            swap(arr,index,(index-1)/2);// 当前index 与 父交换
            index = (index-1)/2;
        }
    }
    private void heapInsert(int[] arr, int index) {
        /*找爸爸*/
//        int parent_index = (index-1)/2;
        while (arr[index]> arr[(index-1)/2]){
            swap(arr,index, (index-1)/2);
            index =  (index-1)/2;

        }
    }
    private void heapInsert1(int[] arr, int index) {
        int p = (index-1)/2;
        while (arr[index]>arr[p]){
            swap(arr,index,p);
            index = p;
        }
    }
}
