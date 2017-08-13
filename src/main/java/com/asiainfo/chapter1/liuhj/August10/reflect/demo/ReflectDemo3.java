package com.asiainfo.chapter1.liuhj.August10.reflect.demo;

import java.lang.reflect.Method;

public class ReflectDemo3 {
    public ReflectDemo3(){}

    public static void main(String[] args) throws Exception{
        getMethodDemo();

    }

    /*   获取指定Class中的公共函数
    *
    * */
    private static void getMethodDemo() throws Exception {
        Class clazz =Class.forName("com.asiainfo.chapter1.liuhj.August10.bean.Person");
        Method[] methods =clazz.getMethods();
        for (Method method: methods){
            System.out.println(method);

        }

    }

}
