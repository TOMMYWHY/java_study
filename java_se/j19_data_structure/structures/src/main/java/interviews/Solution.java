package interviews;

//
//笔试题目三十分钟：
//        Give two array A, B which can be represented as two horizontal lines.
//        you can connect two node once they are equal,
//        i.e. `A[i] === B[j]`
//        make the drawing, find the max lines count which will not result in cross-line
//        1  3  5
//        |   \
//        |    \
//        1  5  3
//        Example 1
//        Input: A = [1,3,5], B = [1,5,3]
//        Output: 2
//        Explain: 5 can not connect to 5 cause it will cause the cross-line with 3
//        Example 2
//        Input: A = [1,1,2,1], B = [3,3,1]
//        Output: 1
//        Example 3
//        Input: A = [3,3,2,3,3], B = [1,3,1,2]
//        Output: 2
//        Example 4
//        Input: A = [1,4], B = [3,5]
//        Output: 0
//


/*
* Dynamic programming
* */

import org.junit.Test;

public class Solution {
    @Test
    public void test_dp01 (){
        int [] a = {1,3,5};
        int [] b = {1,5,3};
        System.out.println(dp(a,b));
    }

    @Test
    public void test_dp02 (){
        int [] a = {3,3,2,3,3};
        int [] b = {1,3,1,2};
        System.out.println(dp2(a,b));
    }

    public static int dp(int[] a, int [] b){
        int n= a.length;
        int m = b.length;

        int [] prev = new int [m+1];// 滚动数组 : 原始方案使用 mXn，对于n来说只需要i i+1即可，O(n)复杂度
        //dp[n][m]=0 dp[n][j]=0 dp[i][m]=0
        for (int i = n-1; i >=0; i--) { //先求出i+1 再求i
            int[] dp = new int [m+1]; //
            for (int j = m-1; j >=0; j--) {
                if(a[i]==b[j]){
                    dp[j] = 1+prev[j+1]; // dp[i][j] = 1+dp[i+1][j+1]
                }else{
                    dp[j]=Math.max(prev[j],dp[j+1]); // dp[i][j] = max{dp[i+1][j],dp[i][j+1]}
                }
            }
            prev=dp;// 滚动数组
        }
        return prev[0]; // i = 0  j =0
    }


    public static int dp2(int[]a,int[] b){
        int[][] dp = new int [a.length][b.length];
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < b.length; j++) {
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j]-1);
                if (a[i]==b[j]){
                    if (i>=1 && j>=1){
                        dp[i][j] = Math.max(dp[i][j],dp[i-1][j-1]+1);
                    }else{
                        dp[i][j]=1;
                    }
                }
            }
        }
        return  dp[a.length-1][b.length-1];
    }

}
