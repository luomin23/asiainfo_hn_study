package com.asiainfo.chapter1.liangzhiqiang.day6;

/**
 * Created by 君不悔 on 2017/7/31.
 */
public class equals {
    public static void main(String[]args){
        String s1="String";
        String s2="str";
        System.out.println("判断是否以字符串str开头："+s1.startsWith("str"));
        System.out.println("判断是否以字符串ng结尾："+s1.endsWith("ng"));
        System.out.println("判断是否包含字符串tri:"+s1.contains("tri"));
        System.out.println("判断字符串是是否为空："+s1.isEmpty());
        System.out.println("判断两个字符串是否相等："+s1.equals(s2));
    }
}
