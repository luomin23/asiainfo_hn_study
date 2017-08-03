package com.asiainfo.chapter1.liangzhiqiang.day8;

/**
 * Created by 君不悔 on 2017/8/2.
 */
import java.text.*;
import java.util.*;
public class Example1 {
    public static void main(String[]args){
        Date date=new Date();
        DateFormat fullFormat=DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat longFormat=DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat mediumFormat=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        DateFormat shortFormat=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        System.out.println("当前日期的完整格为："+fullFormat.format(date));
        System.out.println("当前日期的长格式为："+longFormat.format(date));
        System.out.println("当前日期的普通格式为："+mediumFormat.format(date));
        System.out.println("当前日期的短格式为："+shortFormat.format(date));
    }
}
