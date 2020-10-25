package com.j_se.demo03;

public class Demo03 {
    public static void main(String[] args) {
        square(3,4);
    }
    public  static void square(int col, int row){
        for (int i = 0; i<col; i++){
            for (int j = 0; j < row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
