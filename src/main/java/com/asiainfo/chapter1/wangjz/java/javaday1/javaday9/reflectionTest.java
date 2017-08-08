package com.asiainfo.chapter1.wangjz.java.javaday1.javaday9;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by wjz123456 on 2017/8/4.
 */
public class reflectionTest {
    @Test
    public void test1(){
        People p=new People();
        p.diaplay("zhongguo ");
        p.toString();
        People p1=new People("wjz",22);
        System.out.println(p1);
    }
    @Test //反射
    public void test2() throws Exception {
        Class<People> clazz=People.class;
        //创建clazz对应的运行时类People类的对象
         People p= clazz.newInstance();
        System.out.println(p);
        Field f1=clazz.getField("name");
        f1.set(p,"wjzz");
        System.out.println(p);
        Field f2=clazz.getDeclaredField("age");
        f2.setAccessible(true);
        f2.set(p,20);
        System.out.println(p);
        Method m1=clazz.getMethod("show");
        m1.invoke(p);
        Method m2=clazz.getMethod("diaplay",String.class);
        m2.invoke(p,"usa");
    }
}
