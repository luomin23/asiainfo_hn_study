package com.asiainfo.chapter1.fengzx.Aug01;

/**
 * Created by fengzx on 2017/8/1.
 */

abstract class Animal{
    private String name;
    private int age;

    public Animal(){}

    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name ){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public abstract void eat();

    public void run(){
        System.out.println("跑步。");
    }
}

class Dog extends Animal{
    public Dog(){}

    public Dog(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("狗吃肉。");
    }
}

class Cat extends Animal{
    public Cat(){}

    public Cat(String name,int age){
        super(name,age);
    }

    public void eat(){
        System.out.println("猫吃鱼。");
    }
}

public class AbstractDemo {
    public static void main(String[] args){
        //Animal a = new Animal();

        Dog d = new Dog();
        d.setName("大黄");
        d.setAge(3);
        System.out.println(d.getName()+"---"+d.getAge());
        d.eat();
        d.run();

        Cat c = new Cat("小怪",5);
        System.out.println(c.getName()+"---"+c.getAge());
        c.eat();
        c.run();
    }
}
