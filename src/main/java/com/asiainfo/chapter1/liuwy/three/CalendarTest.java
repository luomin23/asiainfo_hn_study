package com.asiainfo.chapter1.liuwy.three;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by LENOVO on 2017/7/26.
 */
public class CalendarTest {
    public  static  void main(String[] args){
        //将d构建为当前日期
        GregorianCalendar d=new GregorianCalendar();

        //得到日期和月份
        int today=d.get(Calendar.DAY_OF_MONTH);
        int month=d.get(Calendar.MONTH);

        //System.out.println(today);
        //System.out.println(month);

        //设置d为月的开始日期
        d.set(Calendar.DAY_OF_MONTH,1);
        int weekday=d.get(Calendar.DAY_OF_WEEK);
        System.out.println(weekday);

        //得到一周的第一天（美国一周的第一天为周日）
        int firstDayOfWeek=d.getFirstDayOfWeek();

        // 确定第一行所需要的缩进
        int indent=0;
        while (weekday!=firstDayOfWeek){
            indent++;
            d.add(Calendar.DAY_OF_MONTH,-1);
            weekday=d.get(Calendar.DAY_OF_WEEK);
        }

        //打印周几
        String[] weekdayNames=new DateFormatSymbols().getShortWeekdays();
        do {
            System.out.print(weekdayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH,1);
            weekday=d.get(Calendar.DAY_OF_WEEK);
        }while (weekday!=firstDayOfWeek);
        System.out.println();
        for(int i=1;i<=indent;i++)
            System.out.print(" ");
        d.set(Calendar.DAY_OF_MONTH,1);
        do{
            //打印天
            int day=d.get(Calendar.DAY_OF_MONTH);
            System.out.print(day);

            //用*标志当前天
            if(day==today){System.out.print("*");}
            else {System.out.print("     ");}

            //将d提到下一天
            d.add(Calendar.DAY_OF_MONTH,1);
            weekday=d.get(Calendar.DAY_OF_WEEK);

            //在一周开始新的一行
            if(weekday==firstDayOfWeek){
                System.out.println();
            }
        }
        while (d.get(Calendar.MONTH)==month);

        if (weekday!=firstDayOfWeek)System.out.println();
    }
}
//不理解