package com.asiainfo.chapter1.fengzx.July31;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by fengzx on 2017/7/31.
 */
public class DateFormat {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        String s = sdf.format(d);
        System.out.println(s);

        String ss = "2017-07-31 17:20:10";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date dd = sdf2.parse(ss);
        System.out.println(dd);
    }
}
