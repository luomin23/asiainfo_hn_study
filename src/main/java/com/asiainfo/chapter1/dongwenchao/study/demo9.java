package com.asiainfo.chapter1.dongwenchao.study;

import com.asiainfo.chapter1.zhangyang.week4_day_01.SimpleDateFormatDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 超超 on 2017/8/9 0009.
 */
public class demo9 {
    public static void main(String[]args){
        Date d=new Date();
        SimpleDateFormat b=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        /*Long a=System.currentTimeMillis();
        SimpleDateFormat b=new SimpleDateFormat("yyyy-MM-dd");
        String c=b.format(new Date(Long.parseLong(String.valueOf(a))));*/
        System.out.print(b.format(d));
    }
}
