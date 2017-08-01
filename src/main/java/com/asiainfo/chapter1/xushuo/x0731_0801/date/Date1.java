package com.asiainfo.chapter1.xushuo.x0731_0801.date;

import java.util.Date;

/**
 * Created by root on 2017/7/31.
 * 不同的事件输出样式
 */
public class Date1 {
    public static void main(String[] args) {
        //初始化Date对象
        Date date = new Date();
        //c的使用
        System.out.printf("全部日期和时间信息：%tc%n",date);
        //F的使用
        System.out.printf("年-月-日格式：%tF%n",date);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n",date);
        //r的使用
        System.out.printf("HH:MM:SS PM格式 （12时制）：%tr%n",date);
        //t的使用
        System.out.printf("HH:MM:SS格式：%tT%n",date);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR",date);
    }
}