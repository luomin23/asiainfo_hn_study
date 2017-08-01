package com.asiainfo.chapter1.zhangyang.week4_day_01;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by 11 on 2017/7/31.
 */
/*
日期格式类，也为抽象类
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        //几种实例化DateFormat的方式
        DateFormat df1 = DateFormat.getDateInstance();
        DateFormat df2 = DateFormat.getInstance();
        DateFormat df3 = DateFormat.getDateTimeInstance();
        DateFormat df4 = DateFormat.getTimeInstance();
        System.out.println("默认"+df2.format(new Date()));
        System.out.println("Date默认"+df1.format(new Date()));
        System.out.println("DateTime默认"+df3.format(new Date()));
        System.out.println("Time默认"+df4.format(new Date()));


    }
}
