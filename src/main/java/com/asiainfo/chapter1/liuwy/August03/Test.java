package com.asiainfo.chapter1.liuwy.August03;

/**
 * Created by LENOVO on 2017/8/3.
 */
public class Test {
    public static void main(String[] args){
        Thread a=new ThreadOne();
        Thread b=new ThreadTwo();
        a.start();

        b.start();
        System.out.println("end");
    }
}
