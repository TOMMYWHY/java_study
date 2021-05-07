package com.tommy.why;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tommy.why.mapper")

public class Demo05sssApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo05sssApplication.class, args);
    }

}
