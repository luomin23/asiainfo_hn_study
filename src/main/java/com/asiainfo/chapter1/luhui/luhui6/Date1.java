package com.asiainfo.chapter1.luhui.luhui6;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 18237161432 on 2017/7/31.
 */
public class Date1 {
    public static void main(String[] args){
        /*String q="hello world";
        int end=10;
        int start=6;
        char o[]=new char[end-start];//注意下标的先后，大的在前。
        q.getChars(start,end,o,0);
        char ch="abc".charAt(1);
        String m="stin"+"fs";
        char c[]={'H','e','l','l','o','n'};
        String s=new String(c,3,3);
       String s1=new String(c);
        String s2=new String(s1);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(m);
        System.out.println(o);字符串的查找*/

        Date date=new Date();
        SimpleDateFormat h=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(h.format(date));
      System.out.println(new SimpleDateFormat("[yyyy-MM-dd hh:mm:ss:SSS]").format(new Date()));

    }


}
