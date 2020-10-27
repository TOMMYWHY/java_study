package com.j_se.demo06;
/*string*/
public class Demo06 {
    public static void main(String[] args) {
        int length = "tommywhy1989@gmail.com".length();
        System.out.println(length);

        String str1 = "tommy";
        String str2 = "why";
        String str3 = str1.concat(str2);
        System.out.println(str3);
        System.out.println("--------------");

        String str4 = str3.substring(4,7);
        System.out.println(str4);
    }
}
