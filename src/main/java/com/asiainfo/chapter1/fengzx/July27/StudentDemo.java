package com.asiainfo.chapter1.fengzx.July27;

/**
 * Created by fengzx on 2017/7/27.
 */

class Student{
    private String name;
    private int age;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        if (a<=0 || a>120){
            System.out.println("您输入的年龄有误。");
        }else {
            age = a;
        }
    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println("姓名："+name+"   年龄："+age);
    }
}
class StudentDemo {
    public static void main(String[] args){
        Student s = new Student();
        s.show();

        //s.name = "fengzx";
        //正常赋值
        //s.age = 20;
        //有问题赋值
        //s.age = -20;
        //s.checkAge(-20);
        s.setName("fengzx");
        s.setAge(20);
        s.show();
        System.out.println("年龄是"+s.getAge());
    }
}
