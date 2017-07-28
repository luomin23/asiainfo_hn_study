package com.asiainfo.chapter1.zhangyang.day_03;

/**
 * Created by 11 on 2017/7/26.
 */
/*
 多态
 *向上转型，可以让父类对象调用子类重写的方法，但不能调用子类新增的方法
 */
class Person01 {
    public void Say() {
        System.out.println("父类的say()方法！");
    }
}

class Student01 extends Person01 {
    public void Say() {
        System.out.println("子类的say()方法！");
    }

    public void tell() {
        System.out.println("子类的tell()方法！");
    }
}