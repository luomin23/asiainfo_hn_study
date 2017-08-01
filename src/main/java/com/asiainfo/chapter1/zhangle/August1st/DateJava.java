package com.asiainfo.chapter1.zhangle.August1st;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by del on 2017/8/1.
 */
public class DateJava {

    public static void date(){
        /*使用 toString() 函数显示日期时间*/
        Date da=new Date();
        System.out.println("日期1："+da);
        System.out.println("日期2："+da.toString());
        /*使用 SimpleDateFormat 格式化日期*/
        SimpleDateFormat sd=new SimpleDateFormat("yy-mm-dd hh:mm:ss WW"+"周");
        System.out.println("日期3："+sd.format(da));
        /*使用printf格式化日期  以%t开头  %n换行*/
        System.out.printf("全部日期时间：%tc%n",da);
        System.out.printf("年/月/日：%tD%n",da);
        System.out.printf("年-月-日：%tF%n",da);
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",da);
        System.out.printf("HH:MM:SS 格式（24时制）：%tT%n",da);
        System.out.printf("HH:MM 格式（24时制）：%tR%n",da);


    }
    public static void main(String[] args) {
        DateJava date = new DateJava();
        date();
    }
}
