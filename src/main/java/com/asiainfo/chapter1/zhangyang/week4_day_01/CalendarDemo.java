package com.asiainfo.chapter1.zhangyang.week4_day_01;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by 11 on 2017/7/31.
 */
/*
日期抽象类
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //Calendar为抽象类只能通过其子类GregorianCalendar
        //和类中的方法getInstance()方法。
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = new GregorianCalendar();
        System.out.println("年份："+c1.get(Calendar.YEAR));
        System.out.println("月份："+(c1.get(Calendar.MONTH)+1));
        System.out.println("号数："+c1.get(Calendar.DATE));
        System.out.println("今年的第："+c1.get(Calendar.DAY_OF_YEAR)+"天");
        System.out.println("本月的第："+c1.get(Calendar.DAY_OF_MONTH)+"天");
        System.out.println("本月的第："+c1.get(Calendar.DAY_OF_WEEK_IN_MONTH)+"周");
        System.out.println("星期："+(c1.get(Calendar.DAY_OF_WEEK)-1));
    }
}
