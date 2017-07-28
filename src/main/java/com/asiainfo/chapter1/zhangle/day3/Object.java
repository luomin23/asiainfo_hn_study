package com.asiainfo.chapter1.zhangle.day3;

/**
 * Created by del on 2017/7/26.
 */
public class Object {

    public Object(){
        System.out.println("这是一个无参的构造函数");
    }

    public void person(String name,int age){
        System.out.print("我的名字是："+name+",年龄："+age);

    }

    public static void main(String[] args) {
        Object ob= new Object();//Object()为无参的构造函数
        ob.person("zhangl",18);




    }
}
