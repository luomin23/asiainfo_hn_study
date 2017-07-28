package com.asiainfo.chapter1.zhangle.day5;

/**
 * Created by del on 2017/7/28.
 */
public class StaticWork {
    public static int a=10;
    public int b=10;
    public static void testNum(){
        double d=a;
        int c=a--;
        int c1= a;  //int c1= StaticWork.a;
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("c1="+c1);
    }
    public static void variable(){

    }
    public static void main(String[] args){
        testNum();




    }

}
