package com.asiainfo.chapter1.fengzx.Aug01;

/**
 * Created by fengzx on 2017/8/1.
 */
public class Student {
    private String name;
    private int age;

    public Student(){
        super();
    }

    public Student(String name,int age){
        super();
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
