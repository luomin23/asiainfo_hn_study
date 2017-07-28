package com.asiainfo.chapter1.zhangyang.day_05;

/**
 * Created by 11 on 2017/7/28.
 */
/*
子类在实例化时，会自动调用父类的构造方法
 */
abstract class Animal1{
    public Animal1(){
        System.out.println("Animal1的构造方法");
    }
    public abstract void voice();
}
class Dog1 extends Animal1{
    public Dog1() {
        System.out.println("Dog1的构造方法");
    }
    @Override
    public void voice() {
        System.out.println("汪汪");
    }
}
public class AbstractDemo03 {
    public static void main(String[] args) {
        Animal1 animal1 = new Dog1();
        animal1.voice();
    }
}
