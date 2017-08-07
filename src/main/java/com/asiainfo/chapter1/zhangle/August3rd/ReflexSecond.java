package com.asiainfo.chapter1.zhangle.August3rd;

import com.asiainfo.chapter1.zhangle.day3.Roles;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by del on 2017/8/3.
 */
public class ReflexSecond {

    /*反射
    * 获取特定的属性
    * */
    public static void specialAttribute() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        /*
        * Class c= Nums.class;
        * 无法获得Nums的属性
        * */
        Class c=Roles.class;//获得Employee类
        try {
            Field f = c.getDeclaredField("name");  //获得name属性 抛出异常
            Object o = c.newInstance();  //实例化类并复制给o 抛出非法访问异常 实例化异常
            f.setAccessible(true);  //使用反射机制 打破封装 导致java属性不安全
            f.set(o,"one");  //给o这个对象的name属性赋值
            System.out.println("name="+f.get(o));
            System.out.println("输出所有public构造器：");
            Constructor[] cs=c.getConstructors();
            for(Constructor cr:cs){
                System.out.println(cr);
            }
            /*
            得到对应类的所有的public方法
            方法一：
            getDeclaredMethods()方法是Method[]类型
            方法二
            Method[] ms=c.getMethods();  //得到对应的pic方法
             */
            Method[] m1=c.getDeclaredMethods();  //通过获得的类.getDeclaredMethods（）得到所有的方法
            System.out.println("输出所有public方法：");
            for(Method md:m1){
                System.out.println(md);
            }

        }catch (NoSuchFieldException e){
            System.out.println("没有找到name这个属性");

        }catch (InstantiationException e1){
            System.out.println("实例化异常");
        }catch (IllegalAccessException e2){
            System.out.println("非法访问");
        }


    }
    public static void main(String[] args) throws Exception {
        specialAttribute();
    }
}
