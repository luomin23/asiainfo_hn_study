package com.asiainfo.chapter1.wangjz.java.javaday1.javaday6;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by wjz123456 on 2017/7/31.
 */
public class date {
    public static void main(String[] args){
        Date date=new Date();
        System.out.println(date);
        System.out.printf("年-月，日:%tF%n",date);
        System.out.printf("月-日-年:%tD%n",date);
        System.out.printf("HH:MM:SS PM格式:%tr%n",date);
        System.out.printf("HH:MM:SS: SS格式 %tT%n",date);
       Date d=new Date();
        SimpleDateFormat f=new SimpleDateFormat("E yyyy.MM.dd 'at' HH:mm:ss a zzz");//自定义日期格式
        System.out.println(f.format(d));
        try {
            System.out.println(new Date());
            Thread.sleep(3000); //时间睡眠
            System.out.println(new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
