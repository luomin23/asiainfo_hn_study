package com.asiainfo.chapter1.zhangyang.week4_day_04;

/**
 * Created by 11 on 2017/8/3.
 */
class LocaderClass01{
    static {
        System.out.println("这是Locadeer类的静态代码");
    }
}
public class ClassDemo02 {
    public static void main(String[] args) {
        Class c = LocaderClass01.class;
        System.out.println("类名："+c.getName());
    }
}
