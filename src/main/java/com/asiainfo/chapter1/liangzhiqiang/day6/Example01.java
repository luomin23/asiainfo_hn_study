package com.asiainfo.chapter1.liangzhiqiang.day6;

/**
 * Created by 君不悔 on 2017/7/31.
 */
class Example01 {
    public static void main(String[]args)throws Exception{
        String str1=new String();//创建一个空的字符串
        String str2=new String("abcd");//创建一个abcd的字符串
        char[] charArray=new char[]{'D','E','F'};//创建一个内容为字符串数组的字符串
        String str3 =new String(charArray);
        System.out.println("a"+str1+"b");
        System.out.println(str2);
        System.out.println(str3);
    }

}
