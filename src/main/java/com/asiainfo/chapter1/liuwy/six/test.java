package com.asiainfo.chapter1.liuwy.six;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by LENOVO on 2017/7/31.
 */
public class test {

    public static void main(String[] args){
      String a="Hello";
      String s=a.substring(1,3);
        System.out.println(s);
        char first=a.charAt(0);
        char last=a.charAt(4);
        System.out.println(first+" "+last);
        int index=a.offsetByCodePoints(0,0);
        int cp=a.codePointAt(index);
        System.out.println(cp);


        String b="morning";
        String message=a+b;
        System.out.println(message);

        String s1=new String();
        s1="a";
        String s2=new String();
        s2="a";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        String other="other";
        String d="p";
        int c=d.compareTo(other);
        System.out.println(c);
        String e="   a   b   c   ";
        System.out.println(e);
        String f=e.trim();
        System.out.println(f);

        Calendar rightNow=Calendar.getInstance();
        int year=rightNow.get(Calendar.YEAR);
        int month=rightNow.get(Calendar.MONTH);
        int day=rightNow.get(Calendar.DATE);
        System.out.println(year);
        System.out.println(month+1);
        System.out.println(day);


        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String riqi=sdf.format(date);
        System.out.println(riqi);


    }
}
