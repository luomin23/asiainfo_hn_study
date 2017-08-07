package com.asiainfo.chapter1.luhui.luhui9;

/**
 * Created by 18237161432 on 2017/8/3.
 */
public class Example {
    public static void main(String [] args){
        MyThread mythread=new MyThread();
        mythread.start();
        while(true){
        System.out.println("Main线程在运行");
    }
    }}
     class MyThread extends Thread{
        public void run(){
            while(true){
            System.out.println("MyThread线程在运行");
        }
        }
    }

