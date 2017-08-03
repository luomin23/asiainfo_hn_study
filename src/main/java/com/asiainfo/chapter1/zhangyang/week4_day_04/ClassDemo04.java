package com.asiainfo.chapter1.zhangyang.week4_day_04;

/**
 * Created by 11 on 2017/8/3.
 */
/*
java反射机制的应用，Class类中
getInterface（）方法，获取一个类实现的全部接口
 */
interface  First{
}
interface Second{
}
interface Third{
}
class Demo implements First,Second,Third{

}
public class ClassDemo04 {
    public static void main(String[] args) {
        Class<?> inter[]= null;//定义class类型的数组
        try {
            inter = Class.forName("com.asiainfo.chapter1.zhangyang.week4_day_04.Demo").getInterfaces();
            //获取全部接口
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Class<?> c:inter){
            System.out.println(c.getName());
        }
    }
}
