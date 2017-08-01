package com.asiainfo.chapter1.zhangyang.week4_day_01;

/**
 * Created by 11 on 2017/7/31.
 */
/*
操作字符串
 */
public class StringDemo01 {
    public static void main(String[] args) {
        String str = "Hello,world";
        char cString = str.charAt(6);//取得指定位置的元素
        System.out.println(str+"第六位索引的字符为"+cString);//判断字符串开头和结尾的元素
        System.out.println(str+"是否已Hello开头"+str.startsWith("Hello"));
        System.out.println(str+"是否已Hello结尾"+str.endsWith("Hello"));
        char cString01[] = str.toCharArray();//将字符串转为字符数组
        String strchar = String.valueOf(cString01);//将数组转为字符串
        for (int i = 0; i <cString01.length ; i++) {
            System.out.print(cString01[i]+" ");
        }
        System.out.println("\n"+strchar);
        System.out.println(str+"的长度为："+str.length());//获取字符串的长度
        System.out.println("将"+str+"中的H换为h："+str.replace('H','h'));//替换字符串的元素
        System.out.println("截取"+str+",从5到9开始的字符串:"+str.substring(6,11));//截取字符串指定元素
    }
}
