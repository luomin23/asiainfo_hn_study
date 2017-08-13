package com.asiainfo.chapter1.Jiashihao.org.lxh.demo15;

/**
 * Created by lenovo on 2017/8/10.
 */
import java.lang.reflect.Method;
public class InvokeSayChinaDemo {
    public static void main(String[] args){
        Class<?> c1 = null;
        try{
            c1 = Class.forName("org.lxh.demo16.Person");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            Method met = c1.getMethod("sayChina");
            met.invoke(c1.newInstance());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
