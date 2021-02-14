package sorts.quickSort;

import org.junit.Test;

import java.util.Arrays;

public class QuickSort1 {
    private static void swap(int[] arr, int i, int minIndex) {
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
    }

    @Test
    public void test(){
        int[] arr = {7,3,2,8,1,9,5,4,6,0};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int l,int r){
        if(l<r){
            int [] p = partition(arr,l,r);
            quickSort(arr,l,p[0]-1);
            quickSort(arr,p[1]+1,r);
        }
    }

    private static int[] partition(int[] arr, int l, int r) {
        int less = l-1; // less 为小于区域
        int more = r;
        while(l<more){
            if(arr[l]<arr[r]){
                /*[i]<num, [i] 与 less区的下一个交换，less区右扩，i++*/
                swap(arr,l,less+1);
                l++;
                less++;
            }else if(arr[l]>arr[r]){
                /*[i]>num, [i] 与 more区前一个交换，more区左扩，i原地*/
                swap(arr,l,more-1);
                more--;

            } else{
                /*[i]=num,i++*/
                l++;
            }
        }
        return null;
    }
}
