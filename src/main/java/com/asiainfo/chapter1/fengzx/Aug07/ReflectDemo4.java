package com.asiainfo.chapter1.fengzx.Aug07;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by fengzx on 2017/8/7.
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.asiainfo.chapter1.fengzx.Aug07.Person");
        Constructor con = c.getConstructor();
        Object obj = con.newInstance();

        Method m1 = c.getMethod("show");
        m1.invoke(obj);
        System.out.println("----------");

        Method m2 = c.getMethod("show2",String.class);
        m2.invoke(obj,"hello");
        System.out.println("----------");

        Method m3 = c.getMethod("show3");
        Object oo = m3.invoke(obj);
        System.out.println(oo);
        System.out.println("----------");

        Method m4 = c.getMethod("show4",String.class,int.class);
        Object ooo = m4.invoke(obj,"haha",100);
        System.out.println(ooo);
        System.out.println("----------");

        Method m5 = c.getDeclaredMethod("function");
        m5.setAccessible(true);
        m5.invoke(obj);
    }
}
