package com.asiainfo.chapter1.luhui.luhui4;

/**
 * Created by 18237161432 on 2017/7/27.
 */
public class Statictest {
    public String name="qwe";
    public int age=6;
    public void eat(){
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
    public void eat(){
        System.out.println("你在吃");
    }
    public void sleep(){
        System.out.println("你在睡觉");
    }
    public void jump(){
        System.out.println("在跳");
    }
}
class Demo_test{
    public static void main(String [] args) {
        Statictest s = new baby();
        s.eat();
        s.jump();
        s.run();

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