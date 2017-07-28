package com.asiainfo.chapter1.zhangyang.day_05;

/**
 * Created by 11 on 2017/7/28.
 */
abstract class Animal{
    public abstract void voice();
}
class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("汪汪");
    }
}
class Cat extends Animal{
    @Override
    public void voice() {
        System.out.println("喵喵");
    }
}
public class AbstractDemo02 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.voice();
        Dog cat = (Dog) animal;
        cat.voice();
    }
}
