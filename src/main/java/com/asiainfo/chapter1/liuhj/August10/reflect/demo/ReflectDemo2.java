package com.asiainfo.chapter1.liuhj.August10.reflect.demo;


import java.lang.reflect.Constructor;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        oreatNewObject();
    }

    private static void oreatNewObject() throws Exception{
        String name ="com.asiainfo.chapter1.liuhj.August10.bean.Person";
        //找寻该名称类文件，并加载进内存，并产生Class对象。
        Class clazz =Class.forName(name);
         // 利用构造器获取到了指定的构造函数对象
        Constructor constructor= clazz.getConstructor(int.class,String.class);// .class表示此字节码文件所对应的类
        //通过该构造器对象的newInstance方法进行对象的初始化。
        Object obj =constructor.newInstance(38,"小明");

        System.out.println(obj);
        //Object obj =clazz.newInstance();


    }


}
