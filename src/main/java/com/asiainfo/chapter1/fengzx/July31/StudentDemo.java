package com.asiainfo.chapter1.fengzx.July31;

/**
 * Created by fengzx on 2017/7/31.
 */

class Student{
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

    public String toString(){
        //return "hello";
        return "name:"+name+", age:"+age;
    }
}


public class StudentDemo {
    public static void main(String[] args){
        Student s = new Student();
        System.out.println(s);
        System.out.println(s.toString());
    }
}
