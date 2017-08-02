package com.asiainfo.chapter1.dongwenchao.day06;
import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * Created by 超超 on 2017/7/31 0031.
 */
public class demo3 {
    public static void main (String [] args){
        /*Date a = new Date();
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(a);*/
        /*int year=0;
        int i=0;
        Calendar time=Calendar.getInstance();
        time.clear();
        time.set(Calendar.YEAR,year);
        time.set(Calendar.MONTH,i-1);
        int day=time.getActualMaximum(Calendar.AM);
        System.out.println(day);*/
        /*Calendar time=Calendar.getInstance();
        Date date=time.getTime();
        System.out.println(date);*/
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR, 2017);
        /*cal.set(Calendar.WEEK_OF_YEAR, 35);*/
        cal.set(Calendar.MONTH, 00);
        cal.set(Calendar.DAY_OF_MONTH, 31);
        /*cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.println(df.format(cal.getTime()));*/
        /*cal.add(Calendar.DATE,4);*/
        Date date=cal.getTime();
        System.out.println(df.format(date));

    }
}
