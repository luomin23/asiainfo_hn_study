package com.asiainfo.chapter1.xushuo.x0807.reflect;

/**
 * Created by root on 2017/8/7.
 */
public class SuperClassDemo02 {                                                                 //定义类
}
class SubClass02 extends SuperClassDemo02{                                                      //继承类
}
class ClassDemo07{
    public static void main(String[] args) {
        Class<?> c1 = null;
        Class<?> c2 = null;
        try{
            c1=Class.forName("com.asiainfo.chapter1.xushuo.x0807.reflect.SuperClassDemo02");    //实例化Class
            c2=Class.forName("com.asiainfo.chapter1.xushuo.x0807.reflect.SubClass02");          //实例化Class
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("SubClass02的父类: "+c1.getSuperclass().getName());                   //取得父类的名称
        System.out.println("SuperClassDemo02的父类: "+c2.getSuperclass().getName());             //取得子类的名称
    }
}
