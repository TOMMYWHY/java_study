package com.tommy.why.entity;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Integer score;
    private String birthday;
    private String insert_time;

    public Student(Integer id, String name, Integer age, Integer score, String birthday, String insert_time) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.birthday = birthday;
        this.insert_time = insert_time;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", birthday='" + birthday + '\'' +
                ", insert_time='" + insert_time + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getInsert_time() {
        return insert_time;
    }

    public void setInsert_time(String insert_time) {
        this.insert_time = insert_time;
    }

    public Student() {
    }


}
