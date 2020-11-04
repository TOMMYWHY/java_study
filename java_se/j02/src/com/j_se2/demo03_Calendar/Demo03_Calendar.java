package com.j_se2.demo03_Calendar;

import java.util.Calendar;

public class Demo03_Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));
    }

}
