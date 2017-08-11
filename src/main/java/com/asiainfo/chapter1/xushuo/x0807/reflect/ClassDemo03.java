package com.asiainfo.chapter1.xushuo.x0807.reflect;

import java.lang.reflect.Constructor;

/**
 * Created by root on 2017/8/7.
 */
class Student {
    private String name;
    private int age;
    public Student() {
        this.name="小婷";
        this.age=19;
    }
    public Student (String name){
        this.name=name;
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }


    public Student (int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String toString() {
        return "姓名: "+getName()+",年龄: "+getAge();
    }
}
public class ClassDemo03 {
    public static void main(String[] args) {
        Class<?> c=null;
        Student stu1 = null;
        Student stu2 = null;
        Student stu3 = null;
        Student stu4 = null;
        Constructor<?> con[]=null;
        try{
            c=Class.forName("com.asiainfo.chapter1.xushuo.x0807.reflect.Student");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        con = c.getConstructors();
        for(int i = 0;i<con.length;i++) {
            System.out.println(i+"---"+con[i]);
        }
        try{
            stu1 =(Student) con[0].newInstance(20);
            stu2 =(Student) con[1].newInstance("小强",21);
            stu3 =(Student) con[2].newInstance("小伟");
            stu4 =(Student) con[3].newInstance();

        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("对象信息: "+stu1);
        System.out.println("对象信息: "+stu2);
        System.out.println("对象信息: "+stu3);
        System.out.println("对象信息: "+stu4);
    }
}
