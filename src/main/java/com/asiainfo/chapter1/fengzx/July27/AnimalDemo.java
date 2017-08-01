package com.asiainfo.chapter1.fengzx.July27;

/**
 * Created by fengzx on 2017/7/27.
 */

class Animal{
    public int num = 100;

    public Animal(){
        System.out.println("Animal");
    }

    public Animal(String name){
        System.out.println("Animal"+name);
    }
}

class Cat extends Animal{
    public Cat(){
        System.out.println("Cat");
    }

    public Cat(String name){
        System.out.println(num);
        System.out.println("Cat"+name);
    }
}

public class AnimalDemo {
    public static void main(String[] args){
        Animal a = new Animal();

        //无参
        //Cat c = new Cat();

        //带参
        Cat c = new Cat("大黄");
    }
}
