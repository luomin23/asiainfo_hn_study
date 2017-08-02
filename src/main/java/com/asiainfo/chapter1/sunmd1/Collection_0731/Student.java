package com.asiainfo.chapter1.sunmd1.Collection_0731;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class Student {
    private int age;
    private String name;

    public Student() {
    }

    public Student(String name ,int age) {
        this.age = age;
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
