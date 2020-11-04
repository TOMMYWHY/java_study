package com.j_se2.demo02_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02_Date {
    public static void main(String[] args) throws ParseException {
//       test1();
//        test2();
//        test3();
//        test4_format();
        test5_parse();
    }

    private static void test5_parse() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss"
        );
        Date date = sdf.parse("1989-11-27 23:45:59"
        );
        System.out.println(date);

    }
    private static void test4_format(){
        SimpleDateFormat sdf = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss"
        );
        Date date = new Date();

        System.out.println( sdf.format(date));

    }

    private static void test3(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);

    }

    private static void test2(){
        Date date = new Date(0L);
        System.out.println(date);
    }


    private static void test1(){
        Date date = new Date();
        System.out.println(date);
    }
}
