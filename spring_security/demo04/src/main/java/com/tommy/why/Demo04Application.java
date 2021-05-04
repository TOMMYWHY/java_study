package com.tommy.why;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Demo04Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo04Application.class, args);
    }

}
