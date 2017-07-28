package com.asiainfo.chapter1.luhui.luhui3;

/**
 * Created by 18237161432 on 2017/7/26.
 */
public class AnimalDemo {
    public static void main(String[] args){
        Animal animal1=new Animal();
        Animal animal2=new Animal("pig",5);
        System.out.println(animal1.name+","+animal1.age+" "+"And"+" "+animal2.name+","+animal2.age);
    }
}
class Animal{
    String name;
    int age;
    Animal() {
        name = "Dog";
        age = 3;
    }
    Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }
    }

