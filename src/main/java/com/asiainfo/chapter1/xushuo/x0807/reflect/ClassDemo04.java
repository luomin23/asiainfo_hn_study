package com.asiainfo.chapter1.xushuo.x0807.reflect;

/**
 * Created by root on 2017/8/7.
 */
interface FirstInterface{
}
interface SecondInterface{
}
interface ThirdInterface{
}
class Demo implements FirstInterface,SecondInterface,ThirdInterface {
}
public class ClassDemo04 {
    public static void main(String[] args) {
        Class<?> inter[] = null;
        try{
            inter = Class.forName("com.asiainfo.chapter1.xushuo.x0807.reflect.Demo").getInterfaces();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Class<?> c: inter) {
            System.out.println(c.getName());
        }
    }
}
