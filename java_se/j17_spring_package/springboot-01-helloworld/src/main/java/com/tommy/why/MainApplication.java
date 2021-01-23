package com.tommy.why;

import com.tommy.why.config.MyConfig;
import com.tommy.why.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String name:beanDefinitionNames){
            System.out.println(name);
        }

        System.out.println("--------");
        User xxoo = run.getBean("XXOO",User.class);
        System.out.println(xxoo.hashCode());

        boolean haha = run.containsBean("haha");
        System.out.println("haha:"+haha);

        MyConfig myConfig = run.getBean(MyConfig.class);
        User user = myConfig.user01();
        System.out.println(user.hashCode());


    }
}
