package search.binarySearch;

import org.junit.Test;

public class BinarySearch {
    public static int exit(int[]arr, int num){

        int lo = 0,hi = arr.length -1;
        while(lo < hi){
//            int mid = (lo+hi)/2;
            int mid = (lo + (hi-lo) )/2;
            if(arr[mid]==num){
                return  mid;
            }else if(arr[mid] > num){
                hi = mid -1;
            }else{
                lo = mid +1;
            }
        }
//        if(arr[hi]==num){
//
//            return hi;
//        }else{
//            return  -1;
//        }
//        System.out.println(arr[hi]);
            return hi;


    }

    public static int nearestIndex(int arr[], int num){
        int l=0,h=arr.length-1;
        int index = -1;
        while(l <= h){
            int mid = (l+h);
            if(arr[mid]<= num){
                index=mid;
                l=mid+1;
            }else {
                h = mid -1;
            }
        }
        return index;
    }
    @Test
    public void test(){
        int arr[] = {11, 22, 33, 44, 66, 77,99};
        System.out.println( nearestIndex(arr,55));
//        System.out.println(111);
    }

}
