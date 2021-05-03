package com.tommy.why;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tommy.why.mapper")

@SpringBootApplication
public class Demo02LoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo02LoginApplication.class, args);
    }

}
