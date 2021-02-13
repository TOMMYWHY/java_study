package leetcode.array;

import org.junit.Test;

import java.util.HashSet;

public class Power2Diffs {

    public static int diff(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int curr : arr) {
            set.add(curr*curr);
        }
        return set.size();
    }

    public static int diff1(int[] arr){
        int N  = arr.length;
        int L = 0;
        int R = N-1;
        int count = 0;
        int leftAbs= 0;
        int rightAbs = 0;
        while(L<=R){
            count ++;
            leftAbs = Math.abs(arr[L]);
            rightAbs = Math.abs(arr[R]);
            if(leftAbs < rightAbs){
                while (Math.abs(arr[R]) == rightAbs && R>=0){
                    R--;
                }
            }else if(leftAbs > rightAbs){
                while (Math.abs(arr[L]) == leftAbs && L<N){
                    L++;
                }
            }else {
                while (Math.abs(arr[R]) == rightAbs && R>=0){
                    R--;
                }
                while (Math.abs(arr[L]) == leftAbs && L<N){
                    L++;
                }
            }
        }
        return count;

    }


    @Test
    public void test(){
        int [] arr = {-2,-1,0,1,2,4};
        System.out.println(diff(arr));
    }
}
