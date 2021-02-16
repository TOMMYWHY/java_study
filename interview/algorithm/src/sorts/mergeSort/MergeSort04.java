package sorts.mergeSort;

import org.junit.Test;

import java.util.Arrays;

public class MergeSort04 {
    @Test
    public void test(){
        int[] arr = {1,4,7,8,3,6,9};
        sort(arr,0, arr.length-1);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }

    private void sort(int[] arr, int l, int r) {
        if(l==r) return;
        int mid = l + (r-l)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr,l,mid,r);

    }

    private void merge(int[] arr,int l,int mid , int r){
      int[] help = new int[r-l+1];
      int i = 0;
      int part1=l;
      int part2= mid+1;
      while (part1<= mid && part2<= r){
          if(arr[part1]<=arr[part2]){
              help[i] = arr[part1];
              i++;
              part1++;
          }else{
              help[i] = arr[part2];
              i++;
              part2++;
          }

      }
        while (part1<= mid){
            help[i] = arr[part1];
            i++;
            part1++;
        }
      while (part2<= r){
          help[i] = arr[part2];
          i++;
          part2++;
      }
        for (int j = 0; j < help.length; j++) {
            arr[l+j] = help[j];
        }
    }

}
