package com.asiainfo.chapter1.xushuo.x0807.reflect;

/**
 * Created by root on 2017/8/7.
 */
class LocaderClass {
    static {
        System.out.println("这是LocaderClass类的静态代码块");
    }
}
public class ClassDemo01 {
    public static void main(String[] args) {
        Class c = null;                                                                     //声明Class对象c
        try                                                                                 //处理异常
        {
            c=Class.forName("com.asiainfo.chapter1.xushuo.x0807.reflect.LocaderClass");      //加载LocaderClass对象
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("类名: "+c.getName());
    }
}
