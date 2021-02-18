package sorts.mergeSort;

import org.junit.Test;

import java.util.Arrays;

public class MergeSort05 {
    @Test
    public void test(){
        int[] arr = {1,4,7,8,3,6,9};
        sort(arr,0, arr.length-1);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    private void sort(int[] arr, int l, int r) {
        if(l==r){return;}
        int mid = l + (r-l)/2;
        sort(arr,l , mid);
        sort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    private void merge(int[] arr,int l,int mid , int r){
        int [] help = new int[r-l+1];
        int p1 = l;
        int p2 = mid+1;
        int i = 0;
        while(p1<=mid && p2 <= r){
            if(arr[p1]<=arr[p2]){
              help[i] = arr[p1];
              i++;
              p1++;
            }else{
                help[i] = arr[p2];
                i++;
                p2++;
            }
        }
        while(p1<=mid){
            help[i] = arr[p1];
            i++;
            p1++;
        }
        while(p2<=r){
            help[i] = arr[p2];
            i++;
            p2++;
        }

        for (int j = 0; j < help.length; j++) {
            arr[l+j] = help[j];
        }
    }

}
