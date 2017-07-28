package com.asiainfo.chapter1.xushuo.x0726_28.polymorphism;

/**
 * Created by root on 2017/7/27.
 * 方法的多态
 */
public class Initail {
    public static void main(String[] args) {
//        Animal obj1 = new Animal();//父类的引用是可以指向其他子类的
//        Animal obj2 = new Dog();//向上转型 父类的引用是可以指向子类的
//        Animal obj3 = new Cat();
//        //Dog obj3 = new Animal();//错误！！
//        obj1.eat();
//        obj2.eat();
//        obj3.eat();
//        //obj2.watchDoor();父类没有 无法引用！
        Dog dog = new Dog();
        Animal animal = dog;//自动类型提升 向上类型转换
        if(animal instanceof Dog){
            Dog dog2 = (Dog)animal;
        }
        else{
            System.out.println("Dog无法进行类型转换");
        }
        //Dog dog2 = animal;//向下类型转换，有风险所以报错
        Dog dog2 = (Dog) animal; //无视风险，强制转换
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;//1、编译时，是Cat类型 2、运行时是Dog类型
        }else{
            System.out.println("Cat无法进行类型转换");
        }
    }
}
