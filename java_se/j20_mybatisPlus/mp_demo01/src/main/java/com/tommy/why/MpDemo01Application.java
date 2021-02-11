package com.tommy.why;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tommy.why.mapper")
@SpringBootApplication
public class MpDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(MpDemo01Application.class, args);
    }

}
