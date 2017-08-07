package com.asiainfo.chapter1.zhangyang.week4_day_04;

/**
 * Created by 11 on 2017/8/3.
 */
/*
java反射机制的应用
通过Class类中的getSuperClass方法获取类的父类
再通过getName（）方法返回一个父类的名称
 */
class SuperClass01{

}
class SubClass01 extends SuperClass01{

}
public class ClassDemo05 {
    public static void main(String[] args) {
        Class<?> c = null;
        Class<?> c1 = null;
        try {
            c =Class.forName("com.asiainfo.chapter1.zhangyang.week4_day_04.SubClass01");
            c1 =Class.forName("com.asiainfo.chapter1.zhangyang.week4_day_04.SuperClass01");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("SubClass类的父类："+c.getSuperclass().getName());
        System.out.println("SuperClass类的父类："+c1.getSuperclass().getName());
    }
}
