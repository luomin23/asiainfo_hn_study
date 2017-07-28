package com.asiainfo.chapter1.wangjz.java.javaday1.javaday5;

/**
 * Created by wjz123456 on 2017/7/28.
 */
public class Cat extends Animal {
    int num=80;
    static int age=90;
    String name="tomocat";

    @Override
    public void eat() {
        System.out.println("猫吃饭");
    }
    public  static  void sleep(){
        System.out.println("猫睡觉");
    }
    public void catMouse(){
        System.out.println("猫抓老鼠");
    }
}
