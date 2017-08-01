package com.asiainfo.chapter1.liangzhiqiang.day6;

/**
 * Created by 君不悔 on 2017/7/31.
 */
public class length {
    public static void main(String[]args){
        String s="abcdedcba";
        System.out.println("字符串的长度为："+s.length());
        System.out.println("字符串中的第一个字符："+s.charAt(0));
        System.out.println("字符c第一次出现的位置："+s.indexOf('c'));
        System.out.println("字符c最后一次出现的位置："+s.lastIndexOf("c"));
    }

}
