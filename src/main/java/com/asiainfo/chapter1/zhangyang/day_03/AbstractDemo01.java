package com.asiainfo.chapter1.zhangyang.day_03;

/**
 * Created by 11 on 2017/7/26.
 */
abstract class Person1{
    public static final String country="中国";
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract void say();//定义抽象方法，没有方法体
}
class Student1 extends Person1{
    public void say() {//重写抽象类所有抽象方法
        System.out.println("我叫"+getName()+",是一名"+country+"人！");
    }
}
public class AbstractDemo01 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();//创建Student实例
        s1.setName("中华");
        s1.say();//调用子类的say()
    }

}
