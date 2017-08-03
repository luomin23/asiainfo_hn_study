package com.asiainfo.chapter1.liuwy.August03;

/**
 * Created by LENOVO on 2017/8/3.
 */
public class TestRunnable {
    public static void main(String[] args){
        Runnable r1=new RunnableOne();
        Thread t1=new Thread(r1);
        Runnable r2=new RunnableTwo();
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
        System.out.println("end!!!");
    }
}
