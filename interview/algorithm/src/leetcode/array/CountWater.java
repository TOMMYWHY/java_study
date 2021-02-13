package leetcode.array;

public class CountWater {
    public static int water1(int[] arr){
        int N = arr.length;
        int water = 0;
        for (int i = 1; i < arr.length-1; i++) {
            int leftMax = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax,arr[j]);
            }
            int rightMax = Integer.MIN_VALUE;
            for (int j = 0; j < N; j++) {
                rightMax = Math.max(rightMax,arr[j]);
            }
            water += Math.max(Math.min(leftMax,rightMax)-arr[i],0);
        }
        return water;
    }


    public static int water2(int[] arr){
        int N = arr.length;
        int[] leftMaxs = new int[N];
        leftMaxs[0] = arr[0];
        for (int i = 0; i < N; i++) {
            leftMaxs[i] = Math.max(leftMaxs[i-1],arr[i]);
        }
        int[] rightMaxs = new int[N];
        rightMaxs[N-1] = arr[N-1];
        for (int i = N-2; i >=0; i--) {
            rightMaxs[i] = Math.max(rightMaxs[i+1],arr[i]);
        }
        int water = 0;
        for (int i = 1; i < N - 1; i++) {
            water += Math.max(Math.min(leftMaxs[i-1],rightMaxs[i+1])-arr[i],0);
        }
        return water;
    }
}
