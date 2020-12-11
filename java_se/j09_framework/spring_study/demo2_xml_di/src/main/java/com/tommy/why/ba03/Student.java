package com.tommy.why.ba03;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("none param constructor~!");
    }

    public Student(String myname, int myage) {
        System.out.println("param constructor~!");
        this.name = myname;
        this.age = myage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
