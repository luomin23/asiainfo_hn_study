package com.asiainfo.chapter1.wangjz.java.javaday1.javaday5;



/**
 * Created by wjz123456 on 2017/7/28.
 */
public class Animaltest {
    public static void main(String[] args) {
        Animal a=new Cat();
        Cat at=(Cat)a;
        Animal d=new Dog();
//        d.run();
//        d.eat();
//        d.sleep();
        a.eat();
        a.sleep();
        a.run();

        at.catMouse();
        System.out.println(at.num);
        System.out.println(a.age);
    }
}
