package com.tommy.why.ba01;

public class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        System.out.println("setname:"+name);
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("setage:"+age);
        this.age = age;
    }
}
