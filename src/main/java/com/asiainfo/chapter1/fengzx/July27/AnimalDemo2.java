package com.asiainfo.chapter1.fengzx.July27;

/**
 * Created by fengzx on 2017/7/27.
 */

class Animal2{
    private String name;
    private int age;

    public Animal2(){}

    public Animal2(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
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

    public void run(){
        System.out.println("跑步");
    }
}

class Dog2 extends Animal2{
    public Dog2(){}

    public Dog2(String name,int age){
        super(name, age);
    }
    public void eat(){
        System.out.println("狗吃骨头");
    }
}

class Cat2 extends Animal2{
    public Cat2(){}

    public Cat2(String name,int age){
        super(name, age);
    }
    public void eat(){
        System.out.println("猫吃鱼");
    }
}

public class AnimalDemo2 {
    public static void main(String[] args){
        Dog2 d = new Dog2();
        d.setName("旺财");
        d.setAge(3);
        System.out.println(d.getName()+"-----"+d.getAge());
        d.run();
        d.eat();

        Dog2 dd = new Dog2("大黄",5);
        System.out.println(dd.getName()+"-----"+dd.getAge());
        dd.run();
        dd.eat();

        Cat2 c = new Cat2();
        c.setName("端午");
        c.setAge(4);
        System.out.println(c.getName()+"-----"+c.getAge());
        c.run();
        c.eat();

        Cat2 cc = new Cat2("小怪",7);
        System.out.println(cc.getName()+"-----"+cc.getAge());
        cc.run();
        cc.eat();
    }
}
