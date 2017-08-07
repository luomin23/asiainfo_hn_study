package com.asiainfo.chapter1.zhangyang.week4_day_04;

/**
 * Created by 11 on 2017/8/3.
 */
/*
使用Object类中的getClass方法
 */
class SuperClass{
    public void show(){
        System.out.println("这是SuperClass类的show方法");
    }
}
class SubClass extends SuperClass{
    public void show(){
        System.out.println("这是SubClass类的show方法");
    }
}
public class ObjectClassDemo01 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        SubClass subClass = new SubClass();
        Class c1 = superClass.getClass();
        Class c2 = subClass.getClass();
        System.out.println("类名："+c1.getName());
        System.out.println("类名："+c2.getName());
    }

}
