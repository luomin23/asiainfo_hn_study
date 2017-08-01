package com.asiainfo.chapter1.luhui.luhui6;
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 18237161432 on 2017/7/31.
 */
public class string {
   /* public static void main(String[] args){
        String p="luhuiis"+"a"+"smartman";
        String q="(.*)smart(.*)";
        boolean i=p.matches(q);
        System.out.println(i);
    }*/
    public static void main(String[] args){
        String p="This order was placed for QT34000! OK?";
            String x="(\\D*)(\\d+)(.*)";
        Pattern r=Pattern.compile(x);
        Matcher m = r.matcher(p);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }
    }
    }

