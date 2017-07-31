package com.asiainfo.chapter1.zhangle.javaapi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by del on 2017/7/31.
 */
public class RegularException {
    static Scanner sc=new Scanner(System.in);
    /*正则表达式 Pattern Matcher*/
    public static void testOne(){
        String str="This is the first fooor 1000 year ";
        String pattern = "(\\D*)(\\d+)(.*)";
        /*
        * 正则表达式 \D*表示非数字匹配 0次或多次
        *           \d+表示数字匹配 1次或多次 等价[0-9]+
        * */
        // 创建 Pattern 对象
        Pattern p=Pattern.compile(pattern);
        // 现在创建 matcher 对象
        Matcher m =p.matcher(str);
        if(m.find()){
            //注意下标不能超过分组的个数
            System.out.println("fond value:"+m.group(0));
            System.out.println("fond value:"+m.group(1));
            System.out.println("fond value:"+m.group(2));
            System.out.println("fond value:"+m.group(3));
        }else {
            System.out.println("no fined");
        }
    }

    /* 对IP地址进行排序：192.168.1.200 10.10.10.10 3.3.50.3 127.0.0.1*/
    public static void idAddress(){
        String temp = "192.168.43.200 12.10.10.10 3.3.50.3";
        /*方法一*/
        temp=temp.replaceAll("0+(\\d{3}+)", "$1");
        String[] st=temp.split(" +");  //+匹配前面的字符或表达式一次或多次
        System.out.println("输出temp:");
        for(String ips:st){
            System.out.println(ips);
        }
        /*方法二*/
        String temp1=temp.replaceAll("(\\d+)", "00$1");
        /*
        * * + 匹配前面的字符或表达式一次或多次
        * $1代表第一部分(\d+)匹配的内容
        * 00$1结果是把192.168.1.200 10.10.10.10 3.3.50.3
        * 匹配成00192.00168.001.00200 0010.0010.0010.0010 003.003.0050.003 00127.000.000.00
        * */
        temp1=temp1.replaceAll("(\\d{3})", "$1");  //将ip地址补成同样的3位数
        String[] str=temp1.split(" +");  //+匹配前面的字符或表达式一次或多次
        System.out.println("输出id地址");
        for(String ips:str){
            System.out.println(ips.replaceAll("0+(\\d+)", "$1"));
        }
    }

    /*end start*/
    public static void startend(){
        String s="babc abc abcd abc";
        String in="\\babc\\b";  //求abc这个单词出现的次数
        //String si="abc";//求字符串内包含连续的abc的次数
        Pattern pattern=Pattern.compile(in);
        Matcher matcher=pattern.matcher(s);
        int i=0;
        while(matcher.find()){
            System.out.println("Match abc number:"+i);
            System.out.println("开始下标:"+matcher.start());
            System.out.println("结束下标:"+matcher.end());
            i++;
        }
        System.out.println("abc出现的次数:"+i);

    }
    public static void startend(String s){
        String in="\\bboot\\b";  //求abc这个单词出现的次数
        Pattern pattern=Pattern.compile(in);
        Matcher matcher=pattern.matcher(s);
        int i=0;
        while(matcher.find()){
            System.out.println("Match boot number:"+i);
            System.out.println("开始下标:"+matcher.start());
            System.out.println("结束下标:"+matcher.end());
            i++;
        }
        System.out.println("boot出现的次数:"+i);

    }

    public static void main(String[] args) {
        String string="i sa dkl bootrun boot runboot";
        String s=".*boot.*";
        boolean b=Pattern.matches(s,string);
        //boolean b=s.matches(s);//和上面的方法实现的效果相同
        System.out.println("字符串内是否有boot:"+b);
        startend(string);
        testOne();
        idAddress();
        startend();
    }
}
