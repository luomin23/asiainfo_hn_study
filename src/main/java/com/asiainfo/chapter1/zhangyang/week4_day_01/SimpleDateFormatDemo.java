package com.asiainfo.chapter1.zhangyang.week4_day_01;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 11 on 2017/7/31.
 */
/*
转换日期格式类
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        String str = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(str);
        System.out.println(sdf.format(date));
    }
}
