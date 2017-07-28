package com.asiainfo.chapter1.zhangle.day5;

/**
 * Created by del on 2017/7/28.
 */
interface IAnimal {
    void foot();
    void study();
}
public class Person extends Animal implements IAnimal {
    //abstractd类的子类必须实现抽象方法
    void play() {
        System.out.println("吃各种");
    }
    /*重载（本类） 方法名同
    参数列表不同  返回类型可以相同也可以不同*/
    public String play(String i) {
        System.out.println("吃各种"+i);
        return i;
    }

    void say() {}

    //接口的方法都需要实现
    public void foot() {}

    public void study() {}

    public static void main(String[] args) {
        Person p=new Person();
        Animal a=new Person();
        Person pn=(Person)a;
        p.play();
        p.play("10+");
    }
}
