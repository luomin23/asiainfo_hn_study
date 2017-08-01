package com.asiainfo.chapter1.liangzhiqiang.day6;

/**
 * Created by 君不悔 on 2017/7/31.
 */
public class replace {
    public static void main(String[]args){
        String s="incast";
        System.out.println("将it替换成cn.it的结果："+s.replace("it","cn.it"));
        String s1="i t c a s t";
        System.out.println("去除字符串两端的空格后的结果："+s1.trim());
        System.out.println("去除字符串中所有空格后的结果："+s1.replace("",""));
    }
}
