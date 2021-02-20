package sorts.mergeSort;

import org.junit.Test;

import java.util.Arrays;

public class MergeSort06 {
    @Test
    public void test(){
        int[] arr = {1,4,7,8,3,6,9};
        sort(arr,0, arr.length-1);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    private void sort(int[] arr, int l, int r) {
        if(l==r){return;}
        int mid = l+(r-l)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    private void merge(int[] arr,int l,int mid , int r) {
        int[] helper = new int[r-l+1];
        int index= 0;
        int p1 = l;
        int p2 = mid+1;
        while (p1<=mid && p2 <= r){
            if(arr[p1]<arr[p2]){
                helper[index++] = arr[p1++];
            }else{
                helper[index++] = arr[p2++];
            }
        }
        while(p1<=mid){
            helper[index++] = arr[p1++];
        }
        while (p2<=r){
            helper[index++] = arr[p2++];
        }
        for (int i = 0; i < helper.length; i++) {
            arr[l+i]= helper[i];
        }
    }
}
