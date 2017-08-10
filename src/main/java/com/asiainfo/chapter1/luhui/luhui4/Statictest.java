package com.asiainfo.chapter1.luhui.luhui4;

/**
 * Created by 18237161432 on 2017/7/27.
 */
public class Statictest {
    public String name="qwe";
    public int age=6;
    public static void eat(){//static 静态成员方法;
        System.out.println("你在吃");
    }
    public void run(){
        System.out.println("你在跑");
    }
    public void jump(){
        System.out.println("你在跳");
    }
}
 class baby extends Statictest{
    public String name="we";
    protected int age=8;
    public static void eat(){//重写静态成员方法；
        System.out.println("你在吃东西");
    }
    public void sleep(){
        System.out.println("你在睡觉");
    }
    public void jump(){//重写非静态成员方法；
        System.out.println("在跳");

    }
}
class Demo_test{
    public static void main(String [] args) {
        //调用已重写的静态成员方法，输出的是父类的方法；
        // 调用已重写的非静态成员方法，输出的是已被重写的子类方法；
        //调用未被重写的父类方法，输出的是父类方法；
        //不能调用子类自身特有的成员变量和成员方法；
        Statictest s = new baby();
        s.eat();
        s.jump();
        s.run();
       // s.sleep();

        System.out.println(s.name + s.age);
        baby b=new baby();
        b.run();
        b.jump();
        b.eat();
        b.sleep();
        System.out.println(b.name+b.age);
        baby a=(baby)s;
    }
}