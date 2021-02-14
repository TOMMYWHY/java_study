package sorts.mergeSort;

import org.junit.Test;

import java.util.Arrays;

public class MergeSort01 {
    @Test
    public void test(){
        int[] arr = {1,4,7,8,3,6,9};
        mergeSort(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr){
        if(arr==null|| arr.length<2)
        process(arr,0,arr.length-1);
    }

    private static void process(int[] arr, int L, int R) {
        if(L==R){return;}
        int mid = L+(R-L)/2;
        process(arr,L,mid);
        process(arr,mid+1,R);
        merge(arr,L,mid,R);
    }

    private static void merge(int[] arr, int L, int M, int R) {
        int [] help = new int[R-L+1];
        int i = 0;
        int p1 = L;
        int p2 = M+1;
        while (p1<=M && p2<=R){
            help[i++] = arr[p1]<=arr[p2] ? arr[p1++]:arr[p2++];
        }
        while (p1 <=M){help[i++] = arr[p1++];}
        while (p2 <=R){help[i++] = arr[p2++];}

        for (int j = 0; j < arr.length ; j++) {
            arr[L+j] = help[j];
        }
    }
}
