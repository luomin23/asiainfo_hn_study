package com.asiainfo.chapter1.xushuo.x0807.reflect;

/**
 * Created by root on 2017/8/7.
 */
class SuperClass{
    public void show() {                                     //定义SuperClass类
        System.out.println("这是SuperClass类的show()方法");    //定义show()方法
    }
}
class SubClass extends SuperClassDemo02 {                           //定义SubClass类，并继承SuperClass类
    public void show() {                                     //重写show方法
        System.out.println("这是SubClass类的show()方法");
    }
}
public class ObjectClassDemo01 {
    public static void main(String[] args) {
        SuperClassDemo02 sup = new SuperClassDemo02();                  //实例化SuperClass类
        SubClass sub = new SubClass();                      //实例化SubClass类
        Class c1 = sup.getClass();                          //实例化Class类
        Class c2 = sub.getClass();                          //实例化Class类
        System.out.println("类名: "+c1.getName());           //取得对象所在的类
        System.out.println("类名: "+c2.getName());
    }
}
