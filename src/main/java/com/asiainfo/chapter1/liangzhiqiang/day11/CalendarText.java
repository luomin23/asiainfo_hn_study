package com.asiainfo.chapter1.liangzhiqiang.day11;

/**
 * Created by 君不悔 on 2017/8/7.
 */

import java.util.*;
public class CalendarText {
    public static void main(String[]args){
        Calendar calendar=Calendar.getInstance();
        calendar.set(2017,8,7);
        calendar.add(Calendar.DATE,100);
        int year=calendar.get(Calendar.YEAR);
        int mouth=calendar.get(Calendar.MONTH)+1;
        int date=calendar.get(Calendar.DATE);
        System.out.println("竣工日期："+year+"年"+mouth+"月"+date+"日");
    }
}
