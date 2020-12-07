package com.tommy.why;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Integer score;
    private String birthday;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", birthday='" + birthday + '\'' +
                ", inert_time='" + inert_time + '\'' +
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

    public String getInert_time() {
        return inert_time;
    }

    public void setInert_time(String inert_time) {
        this.inert_time = inert_time;
    }

    private String inert_time;

}
