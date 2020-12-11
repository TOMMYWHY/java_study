package com.tommy.why.ba02;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**/
@Component(value = "myStudent")
public class Student {

    @Value(value="tommywhy")
    private String name;
    @Value(value = "16")
    private int age;



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
