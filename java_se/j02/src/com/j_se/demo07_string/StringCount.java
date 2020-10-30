package com.j_se.demo07_string;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input =sc.next();
        int countUpper = 0;
        int countLower = 0;
        int cuntNumber=0;
        int countOther=0;
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if('A'<=ch && ch<='Z'){
                countUpper++;
            }
            else if('a'<=ch && ch<='z'){
                countLower++;
            }
            else if('0'<=ch && ch<='9'){
                cuntNumber++;
            }
            else {
                countOther++;
            }
        }
        System.out.println("upper:"+countUpper);
        System.out.println("countLower:"+countLower);
        System.out.println("cuntNumber:"+cuntNumber);

    }
}
