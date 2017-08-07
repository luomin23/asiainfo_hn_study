package com.asiainfo.chapter1.zhangyang.week4_day_04;

import java.lang.reflect.Field;

/**
 * Created by 11 on 2017/8/3.
 */
class  LoaderClass{
    private  int num=100;
    protected  boolean b = true;
    public long l = 123L;
    String str = "Java";
}
public class ClassDemo06 {
    public static void main(String[] args) {
        Class<?> c=null;
        try {
            c = Class.forName("com.asiainfo.chapter1.zhangyang.week4_day_04.LoaderClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Field field[] =c.getDeclaredFields();//取得类中的全部属性
        for (int i = 0; i <field.length ; i++) {
            field[i].setAccessible(true);
            System.out.println("成员属性名称："+field[i].getName());
            System.out.println("成员属性类型："+field[i].getType());
            try {
                System.out.println("成员属性内容："+field[i].get(c.newInstance()));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
            System.out.println("*******************");
        }
    }
}
