package com.asiainfo.chapter1.liuwy.three;

import java.util.Scanner;

/**
 * Created by LENOVO on 2017/7/26.
 */
public class EnumTest {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.print("Entet a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input=a.next().toUpperCase();
        Size size=Enum.valueOf(Size.class,input);
        System.out.println("size="+size);
        System.out.println("abbreviation="+size.getAbbreviation());
        if(size== size.EXTRA_LARGE){
            System.out.println("Good job--you paid attention to the_.");
        }
    }
    enum Size{
        SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
        private  Size(String abbreviation){this.abbreviation=abbreviation;}
        public  String getAbbreviation(){return  abbreviation;}
        private  String abbreviation;

    }
}

