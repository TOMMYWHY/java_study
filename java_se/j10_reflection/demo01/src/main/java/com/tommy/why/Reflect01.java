package com.tommy.why;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("com.tommy.why.User");
//        User user = new User();
//        c1 = user.getClass();
        System.out.println(c1.hashCode());
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        System.out.println("-----");

        User user3 = (User)c1.newInstance();
        System.out.println(user3);
        Method setName = c1.getDeclaredMethod("setName", String.class);
        System.out.println(setName);
        setName.invoke(user3,"tommy");
        System.out.println(user3);
        user3.setAge("18");
        System.out.println(user3);


    }
}
class User{
    private int id;
    private String name;
    private String age;

    public User() {
    }

    public User(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
