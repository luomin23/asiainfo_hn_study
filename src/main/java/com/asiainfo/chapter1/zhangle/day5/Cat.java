package com.asiainfo.chapter1.zhangle.day5;

/**
 * Created by del on 2017/7/28.
 */
abstract class Cat extends Animal{
    //子类是abstract 的可以选择实现父类的抽象方法
    public void eat() {
        System.out.println("吃鱼");
    }
    public void play(){
        System.out.println("玩草");
    }

    public void work(){
        System.out.println("玩草");
    }


}
