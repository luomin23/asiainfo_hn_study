package com.asiainfo.chapter1.zhangyang.day_05;

/**
 * Created by 11 on 2017/7/28.
 */
/*
抽象类的构造方法，子类的构造方法中隐含super（）
 */
abstract class Person01{
   public Person01(){
       System.out.println("抽象类person的无参构造方法");
   }
}
class Student01 extends Person01{
    public Student01(){
        System.out.println("子类Student的无参构造方法");
    }
}
public class AbstractDemo01 {
    public static void main(String[] args) {
        Student01 student01 = new Student01();
    }
}
