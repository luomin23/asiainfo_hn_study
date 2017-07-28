package com.asiainfo.chapter1.xushuo.x0726_28.polymorphism;

/**
 * Created by root on 2017/7/27.
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗是吃肉的");
    }
    public void watchDoor(){
        System.out.println("狗具有看门的能力");
    }
}
