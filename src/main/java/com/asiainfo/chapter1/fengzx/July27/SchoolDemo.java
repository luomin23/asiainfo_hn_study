package com.asiainfo.chapter1.fengzx.July27;

import javax.jnlp.PersistenceService;

/**
 * Created by fengzx on 2017/7/27.
 */

class Person{
    private String name;
    private int age;

    public Person(){ }

    public Person(String name,int age){
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

class Student1 extends Person{
    private String sid;

    public Student1(){ }

    public Student1(String name,int age,String sid){
        super(name,age);
        this.sid = sid;
    }

    public void setSid(String sid){
        this.sid = sid;
    }
    public String getSid(){
        return sid;
    }

    public void study(){
        System.out.println("good good studay");
    }
}

class Teacher extends Person{
    private String tid;

    public Teacher(){ }

    public Teacher(String name,int age,String tid){
        super(name,age);
        this.tid = tid;
    }

    public void setTid(String tid){
        this.tid = tid;
    }
    public String getTid(){
        return tid;
    }

    public void teach(){
        System.out.println("good good teach");
    }
}

public class SchoolDemo {
    public static void main(String[] args){
        Student1 s = new Student1();
        s.setName("fzx");
        s.setAge(20);
        s.setSid("007");
        System.out.println(s.getName()+"-----"+s.getAge()+"-----"+s.getSid());
        s.study();

        Student1 ss = new Student1("lwy",21,"008");
        System.out.println(ss.getName()+"-----"+ss.getAge()+"-----"+ss.getSid());
        ss.study();

        Teacher t = new Teacher();
        t.setName("fzxteacher");
        t.setAge(28);
        t.setTid("077");
        System.out.println(t.getName()+"-----"+t.getAge()+"-----"+t.getTid());
        t.teach();

        Teacher tt = new Teacher("lwyteacher",29,"088");
        System.out.println(tt.getName()+"-----"+tt.getAge()+"-----"+tt.getTid());
        tt.teach();
    }
}
