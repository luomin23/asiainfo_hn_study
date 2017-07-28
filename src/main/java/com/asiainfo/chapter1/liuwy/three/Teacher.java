package com.asiainfo.chapter1.liuwy.three;

/**
 * Created by LENOVO on 2017/7/26.
 */
public class Teacher {
    private String name;
    private int age;
    private double salary;

    public Teacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void print(){
        System.out.println("姓名："+this.name);
        System.out.println("年龄："+this.age);
        System.out.println("工资："+this.salary);
    }
}
