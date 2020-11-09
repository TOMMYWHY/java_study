package com.j_web.demo02_annotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args) throws IOException {
        Calculator c = new Calculator();
        Class cls = c.getClass();
        Method[] methods = cls.getMethods();
        int number= 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bugs.txt"));
        for (Method method : methods){
            if(method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(c);
                }catch (Exception e){
                    number++;
                    bw.write(method.getName()+" exception...");
                    bw.newLine();
                    bw.write("exception name:"+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("exception name:"+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("---------");
                    bw.newLine();

                }
            }
        }
        bw.write(" total get exception:"+ number);
        bw.flush();
        bw.close();
    }
}
