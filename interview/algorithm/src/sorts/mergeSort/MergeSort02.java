package sorts.mergeSort;

import org.junit.Test;

import java.util.Arrays;

public class MergeSort02 {
    @Test
    public void test(){
        int[] arr = {1,4,7,8,3,6,9};
//        mergeSort(arr);
        process(arr,0, arr.length-1);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr){
        if (arr==null || arr.length<2) return;
        process(arr,0, arr.length-1);

    }

    private static void process(int[] arr, int l, int r) {
        if (l==r) return;
        int mid = (l+r)/2;
        process(arr,l,mid);
        process(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int[] help = new int[r-l+1];
        int i = 0;
        int p1 = l, p2 = mid+1;
        while(p1<=mid && p2<=r){
//            help[i++] = arr[p1]<=arr[p2] ? arr[p1++]:arr[p2++];
            if(arr[p1]<= arr[p2]){
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
//            help[i++] = arr[p1++];
            help[i] = arr[p1];
            i++;
            p1++;
        }
        while( p2<=r){
//            help[i++] = arr[p2++];
            help[i] = arr[p2];
            i++;
            p2++;
        }
        for (int j = 0; j < help.length; j++) {
            arr[l+j] = help[j];
        }
    }
}
