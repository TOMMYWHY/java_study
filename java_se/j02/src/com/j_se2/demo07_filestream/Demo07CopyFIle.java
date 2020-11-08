package com.j_se2.demo07_filestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo07CopyFIle {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(
                "/Users/Tommy/Desktop/a.jpeg");
        FileOutputStream fos = new FileOutputStream(
                "/Users/Tommy/Desktop/testing/b.jpeg"
        );
        /*int len = 0;
        while((len = fis.read()) !=-1){
            fos.write(len);
        }*/
        byte[] bytes = new byte[1024];
        int len =0;
        while((len = fis.read(bytes)) !=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
