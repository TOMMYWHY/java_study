package arrays.sparseArr;

import org.junit.Test;

public class SparseArray {
    public static int[][] toSparse(int[][] arr){

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                 if(arr[i][j] != 0){
                     count++;
                 }
            }
        }

        int[][] result = new int[count + 1][3];
        result[0][0]  = arr.length;
        result[0][1]  = arr[0].length;
        result[0][2]  = count;

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] != 0){
                    index++; // index 从1开始
                    result[index][0] = i;
                    result[index][1] = j;
                    result[index][2] = arr[i][j];
                }
            }
        }

        return result;
    }

    @Test
    public void test(){
        int[][] arr = new int[10][10];
        arr[1][2]=1;
        arr[3][1]=2;
        arr[2][2] =2;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+",");
            }
            System.out.println();
        }

        int[][] result = toSparse(arr);
        System.out.println("----");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + ","+result[i][1] +"," +result[i][2]);

        }
    }
}
