package com.asiainfo.chapter1.zhangyang.week4_day_01;

/**
 * Created by 11 on 2017/7/31.
 */
public class StringDemo {
    public static void main(String[] args) {
        //初始化字符串的两种方式，一种直接赋值，一种构造方法赋值
        //两者的存储机制存在很大的区别
        //String类为final，不可被继承
        String str = "我爱编程";
        String str1 = "我爱编程";
        String str2 = new String("我爱编程");
        String str3 =str2;
        if (str==str1){
            System.out.println("str==str1:ture");
        }else {
            System.out.println("str==str1:false");
        }
        if (str2==str3){
            System.out.println("str2==str3:ture");
        }else {
            System.out.println("str2==str3:false");
        }
        if (str==str2){
            System.out.println("str==str2:ture");
        }else {
            System.out.println("str==str2:false");
        }
    }
}
