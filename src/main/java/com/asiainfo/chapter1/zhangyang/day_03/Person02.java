package com.asiainfo.chapter1.zhangyang.day_03;

/**
 * Created by 11 on 2017/7/26.
 */

/*
 *向上转型，可以让父类对象调用子类重写的方法，但不能调用子类新增的方法
 */
class Person02 {
    public void Say02() {
        System.out.println("父类的say()方法！");
    }
}

class Student02 extends Person02 {
    public void tell02() {
        System.out.println("子类的tell()方法！");
    }

    public void print02() {
        System.out.println("子类的print()方法！");
    }

    public static void main(String[] args) {

        Person02 p2 = new Student02();// 子类Student01向上转型为父类Person
        Student02 s2 = (Student02) p2;// 将向上转型的父类对象向下转型为子类对象
        s2.Say02();
        s2.tell02();
        s2.print02();

    }
}