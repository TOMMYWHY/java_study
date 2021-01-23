package com.tommy.why.config;

import com.tommy.why.pojo.Car;
import com.tommy.why.pojo.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:beans.xml")
//@EnableConfigurationProperties(Car.class)
public class MyConfig {
    @Bean("XXOO")
    public User user01(){
        return new User("tommywhy",16);
    }


}
