package sorts.mergeSort;

import org.junit.Test;

import java.util.Arrays;

public class MergeSort {
    public  void sort(int[] arr, int left, int right){
        if(left==right){return;}
        int mid = (left + right)/2;
        sort(arr,left,mid);
        sort(arr,mid+1,right);

        mergeSort(arr,left,mid+1,right);
    }
    public void mergeSort(int arr[],int leftPtr,int rightPtr,int rightBound){
        int mid = rightPtr - 1;
        int[] temp = new int[rightBound - leftPtr + 1];
        int i = leftPtr;
        int j = rightPtr;
        int k = 0;

        while (i <= mid && j<=rightBound){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
//                temp[k] = arr[i];
//                i++;
//                k++;
            }else {
                temp[k++] = arr[j++];
//                temp[k] = arr[j];
//                j++;
//                k++;
            }
        }
        while (i <= mid){
            temp[k++] = arr[i++];
        }
        while (j <=rightBound){
            temp[k++] = arr[j++];
        }
        System.out.print(Arrays.toString(temp));

        for (int l = 0; l < temp.length; l++) {
            arr[leftPtr+l] = temp[l];
        }
    }



    @Test
    public void test(){
        int[] arr = {1,4,7,8,3,6,9};
        sort(arr,0, arr.length-1);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
