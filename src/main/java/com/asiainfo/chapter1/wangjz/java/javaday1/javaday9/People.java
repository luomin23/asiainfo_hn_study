package com.asiainfo.chapter1.wangjz.java.javaday1.javaday9;

/**
 * Created by wjz123456 on 2017/8/4.
 */
public class People {
    public  String name;
    private int age;
    public People( ) {

    }
    public People(String name) {
        this.name = name;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show(){
System.out.println("我是一个人！");
    }
    public void diaplay(String nation){
        System.out.println(nation);

    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
