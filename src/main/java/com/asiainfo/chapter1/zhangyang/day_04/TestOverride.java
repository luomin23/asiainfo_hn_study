package com.asiainfo.chapter1.zhangyang.day_04;

/**
 * Created by 11 on 2017/7/27.
 */
/*
    使用super关键字可以调用父类中被重写的方法，但是必须放在首行
 */
class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}
class Dog extends Animal{
    @Override
    public void move() {
        super.move();
        System.out.println("狗可以跑和走");
    }
}
public class TestOverride {
    public static void main(String[] args) {
       // Animal a = new Animal();
       Animal b = new Dog();
        //a.move();
        b.move();
    }
}
