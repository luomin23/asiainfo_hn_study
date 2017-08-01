package com.asiainfo.chapter1.wangjz.java.javaday1.javaday6;

/**
 * Created by wjz123456 on 2017/7/31.
 */
public class Stringtest {
    public static void main(String[] args) {
        String s1="wjz";
        int a1=20;
        String s2= "my name is :"+s1;
        System.out.println(s2);
//       String split=s2.split(":",2);
//        System.out.println(split);
        System.out.println(s1.substring(1,2));//返回子字符串
        System.out.println(s2.length());//返回字符串的长度
        System.out.println(s2.replace("m","x"));//字符串的替换
        System.out.println(s1.contains("w"));//字符串是否包含指定的字符序列
        System.out.println(s2.toUpperCase());//全部转换为大写字符
        String w1="wjz";
        String w2="wjz";
        System.out.println(w1==w2);
        System.out.println(w1.equals(w2));
    }
}
