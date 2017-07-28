package com.asiainfo.chapter1.zhangle.day3;

/**
 * Created by del on 2017/7/26.
 */
abstract class Animal {
    abstract void eat();

}class Cat extends Animal{
    void eat() {
        System.out.println("吃鱼");
    }
    public void play(){
        System.out.println("玩草");
    }
}
class Dog extends Animal{

    void eat() {
        System.out.println("吃骨头");
    }
    public void play(){
        System.out.println("玩飞盘");
    }
}
