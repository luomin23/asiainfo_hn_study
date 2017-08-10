package com.asiainfo.chapter1.dongwenchao.study;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.YEAR;
/**
 * Created by 超超 on 2017/8/10 0010.
 */
public class demo10 {
    public static void main(String[] args) {
        Calendar a=Calendar.getInstance();
        int day=a.get(Calendar.DATE);
        int month=a.get(Calendar.MONTH)+1;
        int year=a.get(YEAR);
        int dow=a.get(DAY_OF_WEEK);
        int dom=a.get(Calendar.DAY_OF_MONTH);
        int doy=a.get(Calendar.DAY_OF_YEAR);
        System.out.println("当期时间: " + a.getTime());
        System.out.println("日期: " + day);
        System.out.println("月份: " + month);
        System.out.println("年份: " + year);
        System.out.println("一周的第几天: " + dow);  // 星期日为一周的第一天输出为 1，星期一输出为 2，以此类推
        System.out.println("一月中的第几天: " + dom);
        System.out.println("一年的第几天: " + doy);
    }
}
