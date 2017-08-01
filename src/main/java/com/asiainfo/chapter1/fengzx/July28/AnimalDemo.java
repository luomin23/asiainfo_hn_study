package com.asiainfo.chapter1.fengzx.July28;

/**
 * Created by fengzx on 2017/7/28.
 */

class Animal{
    public void eat(){}
}

class Dog extends Animal{
    public void eat(){
        System.out.println("Dog eat");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("Cat eat");
    }
    public void play(){
        System.out.println("Cat play");
    }
}

public class AnimalDemo {
    public static void main(String[] args){
        Animal a = new Dog();
        a.eat();

        a = new Cat();
        a.eat();
        //a.play();

        Cat c = (Cat)a;
        c.eat();
        c.play();

        //Dog d = (Dog)a;
        //d.eat();
    }
}
