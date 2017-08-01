package com.asiainfo.chapter1.luhui.luhui6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by 18237161432 on 2017/7/31.
 */
public class Date2 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String shengri=scanner.nextLine();
        SimpleDateFormat d=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date e=d.parse(shengri);
            long l= e.getTime();
            Date date =new Date();
            long n=date.getTime();

            long num=n-l;
            System.out.println(num);
            Date date2=new Date(num);
            SimpleDateFormat sdf= new SimpleDateFormat("dd hh:mm:ss");
            String dateStr = sdf.format(num);
            System.out.println(dateStr);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }




    }
}
