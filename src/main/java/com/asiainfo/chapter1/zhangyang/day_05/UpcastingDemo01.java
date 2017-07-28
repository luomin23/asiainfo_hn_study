package com.asiainfo.chapter1.zhangyang.day_05;

/**
 * Created by 11 on 2017/7/28.
 */
/*
验证向上转型
 */
class Person{
    public void say(){
        System.out.println("父类person的say方法");
    }
}
class Student extends Person{
    public void say(){
        System.out.println("子类student的say方法");
    }
    public void tell(){
        System.out.println("子类student的tell方法");
    }
}
public class UpcastingDemo01 {
    public static void main(String[] args) {
        Person person = new Student();//子类student向上转型为父类person
        person.say();//转型后可以访问子类重写父类的
    }
}
