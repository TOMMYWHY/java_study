package com.tommy.why.entity;

import com.tommy.why.annotation.MyAnn;

@MyAnn(content = "contenttttt")
public class User {
    private int id;
    private String name;

    public void eat(){
        System.out.println("eating...");
    }

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
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
}
