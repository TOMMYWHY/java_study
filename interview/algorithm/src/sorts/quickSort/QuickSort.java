package sorts.quickSort;

import org.junit.Test;

import java.util.Arrays;

public class QuickSort {
    private static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }

    public static void sort(int arr[], int leftBound,int rightBound){
        if(leftBound>=rightBound)return; // important 跳出递归的条件
//        partition(arr,leftBound,rightBound);
        int mid = partition(arr,leftBound,rightBound);
        sort(arr,leftBound,mid-1);
        sort(arr,mid+1,rightBound);
    }

    static int partition(int[] arr, int leftBound,int rightBound){
        int pivot = arr[rightBound];
        int left = leftBound;
        int right = rightBound-1;
        while (left<=right){
            while(left<=right && arr[left] <= pivot) left++; // left++ 超过数组长度都没有比pivot 大 //left<=right，left再加一次 得到比pivot更大的
            while(left<=right && arr[right] > pivot) right--;// right-- 到头可能都比pivot 小
//            System.out.println("left:"+left);
//            System.out.println("right:"+right);
            if(left< right) swap(arr,left,right);
//            System.out.println(Arrays.toString(arr));
        }
        swap(arr,left,rightBound);
        return left;
    }

    @Test
    public void test(){
        int[] arr = {7,3,2,6,8,1,9,5,4,10};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
