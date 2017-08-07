package com.asiainfo.chapter1.zhangyang.week4_day_04;

/**
 * Created by 11 on 2017/8/3.
 */
/*
通过无参构造方法实例化对象
通过Class类的newInstance()方法创建Class对象对应类的实例
 */
class Student{
    private String name;
    private int age;
    public Student(){
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

    public void setAge(int age) {
        this.age = age;
    }
    public  String toString(){
        return "姓名："+getName()+",年龄："+getAge();
    }
}
public class ClassDemo03 {
    public static void main(String[] args) {
        Class<?> c = null;
        Student stu = null;
        try {
            c = Class.forName("com.asiainfo.chapter1.zhangyang.week4_day_04.Student");//加载Student对象
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            stu= (Student) c.newInstance();//向下转型为student对象
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        stu.setName("小强");
        stu.setAge(21);
        System.out.println("对象信息："+stu);
    }
}
