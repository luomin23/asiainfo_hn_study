package com.asiainfo.chapter1.Jiashihao.leiduixiang;

/**
 * Created by lenovo on 2017/7/26.
 */
    class Person1{
    private String name;
    private int age;
    public Person1(){
        System.out.println("父类Person1中的构造。");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
class Student extends Person1{

    private String school;
    public Student(){
        super();
        System.out.println("子类Student中的构造。");
    }
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }
}
public class jicheng {
    public static void main(String args[]){
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(23);
        stu.setSchool("郑州大学");
        System.out.println("姓名："+ stu.getName()+",年龄："+ stu.getAge()+ ",学校：" + stu.getSchool());
    }
}
