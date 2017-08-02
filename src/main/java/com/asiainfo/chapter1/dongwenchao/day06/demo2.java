package com.asiainfo.chapter1.dongwenchao.day06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 超超 on 2017/7/31 0031.
 */
public class demo2 {
    public static void main(String[] args){
        /*String a1 = "I am noob " + "from runoob.com.";
        String pattern =".*am.*";
        boolean a= Pattern.matches(a1,pattern);
        *//*Pattern p = Pattern.compile("a*b");*//*
        System.out.println(a);*/
        /*String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);
        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }*/
        /*String str = "service@xsoftlab.net";
        String regEx = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
        Pattern pattern=Pattern.compile(regEx);//compile()方法是将给定的正则表达式编译到模式中。
        Matcher matcher=pattern.matcher(str);//matcher()创建匹配给定输入与此模式的匹配器。
        boolean rs = matcher.matches();//编译给定正则表达式并尝试将给定输入与其匹配。判断是否匹配
        System.out.println(rs);*/
        String str="\t";
        /*System.out.println(str);*/
        /*String a="^[A-Za-z]+$";*///全部是字母
        String a1="(^\\s*)|(\\s*$)";
        Pattern pattern=Pattern.compile(a1);
        Matcher b=pattern.matcher(str);
        boolean c=b.matches();
        System.out.println(c);
    }
}
