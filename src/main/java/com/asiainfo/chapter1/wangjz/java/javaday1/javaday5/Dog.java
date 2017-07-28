package com.asiainfo.chapter1.wangjz.java.javaday1.javaday5;

/**
 * Created by wjz123456 on 2017/7/28.
 */
public class Dog extends Animal {
    int num=80;
    static int age=90;
    String name="tomocat";

    @Override
    public void eat() {
        System.out.println("狗吃饭");
    }
    public  static  void sleep(){
        System.out.println("【表情】睡觉");
    }
    public void catMouse(){
        System.out.println("狗吃骨头");
    }

    public void run(){
        System.out.println("狗走路");
    }
}
