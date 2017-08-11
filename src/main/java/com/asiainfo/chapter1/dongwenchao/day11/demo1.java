package com.asiainfo.chapter1.dongwenchao.day11;

import com.asiainfo.chapter1.liuwy.three.Teacher;
import junit.framework.TestResult;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static sun.org.mozilla.javascript.internal.ScriptRuntime.StringClass;

/**
 * Created by 超超 on 2017/8/6 0006.
 */
public class demo1  {
    public void setName(){
    }
    /*private static final long serialVersionUID = -2862585049955236662L;*/
    public static void main(String[]args) throws ClassNotFoundException {

        //获取一个对象的父类与实现的接口
        /*Class<?> clazz=Class.forName("com.asiainfo.chapter1.dongwenchao.day11.demo7");
        Class<?> parentClass=clazz.getSuperclass();
        System.out.print("clazz的父类为："+parentClass.getClasses());*/
        //实例化Class类对象
        /*Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        try {
            class1 = Class.forName("com.asiainfo.chapter1.dongwenchao.day11.demo7");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        class2 = new demo7().getClass();
        class3 = demo7.class;
        System.out.println("类名称   " + class1.getName());
        System.out.println("类名称   " + class2.getName());
        System.out.println("类名称   " + class3.getName());*/
        //通过一个对象获得完整的包名和类名
        /*demo7 a=new demo7();
        System.out.println(a.getClass().getName());*/
        /*Class a=StringClass;
       Class[] b= a.getClasses();*/
        /*ClassLoader b=demo7.class.getClassLoader();
        System.out.println(b);*/
       Class a=null;
        Object obj= null;
        try {
            obj = a.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Class[] b={StringClass};
        Method c= null;
        try {
            c = a.getMethod("setName",b);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        Object[] va={"张三"};
        try {
            c.invoke(obj,va);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
