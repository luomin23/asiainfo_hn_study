package com.asiainfo.chapter1.xushuo.x0807.reflect;

import java.lang.reflect.Field;

/**
 * Created by root on 2017/8/7.
 */
class LocaderClass02{                                                                        //定义类
    public long l=123L;                                                                      //定义long属性，权限为public
    protected boolean b = true;                                                         //定义boolean类型，权限是protected
    String str = "Java";                                                                //定义String属性，权限为default
    private int num = 100;                                                                   //定义int类型，权限为private
}
public class ClassDemo08 {
    public static void main(String[] args) {
        Class<?> c=null;
        try{
            c=Class.forName("com.asiainfo.chapter1.xushuo.x0807.reflect.LocaderClass02");   //实例化Class
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Field field[] = c.getDeclaredFields();                                          //取得贝类中的全部成员属性
        for(int i=0;i<field.length;i++) {
            field[i].setAccessible(true);                                               //设置可以访问全部属性
            System.out.println("成员属性名称: "+field[i].getName());                      //取得属性名称
            System.out.println("成员属性类型: "+field[i].getType());                      //取得属性类型
            try{
                System.out.println("成员属性内容: "+field[i].get(c.newInstance()));       //取得属性内容
            }catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("--------------------------------------------");
        }
    }
}
