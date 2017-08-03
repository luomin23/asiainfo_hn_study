package com.asiainfo.chapter1.zhangyang.week4_day_04;

/**
 * Created by 11 on 2017/8/3.
 */
class LocaderClass{
    static {
        System.out.println("这是LocaderClass类的静态代码块");
    }
}
public class ClassDemo01 {
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.asiainfo.chapter1.zhangyang.week4_day_04.LocaderClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("类名："+c.getName());
    }
}
