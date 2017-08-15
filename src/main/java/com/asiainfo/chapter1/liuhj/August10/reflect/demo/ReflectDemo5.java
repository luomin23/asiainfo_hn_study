package com.asiainfo.chapter1.liuhj.August10.reflect.demo;

import java.lang.reflect.Method;

public class ReflectDemo5 {
    public  ReflectDemo5(){


    }

    public static void main(String[] args) throws Exception {
        getMethodDemo();
    }

    private static void getMethodDemo() throws Exception {

        Class clazz= Class.forName("com.asiainfo.chapter1.liuhj.August10.bean.Person");
        Method method =clazz.getMethod("paramMethod",String.class,int.class );//获取空参数一般方法,paramMethod为方法名，表示参数为String int 参数的函数
        Object obj =clazz.newInstance();
        method.invoke(obj,"小强",89);   //obj表示里面的对象，89表示参数
    }

}
