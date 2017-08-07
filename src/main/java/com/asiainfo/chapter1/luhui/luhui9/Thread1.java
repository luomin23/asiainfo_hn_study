package com.asiainfo.chapter1.luhui.luhui9;

/**
 * Created by 18237161432 on 2017/8/3.
 */
public class Thread1 {
    public static void main(String [] args){
        MyThread1 mythread=new MyThread1();
        Thread thread=new Thread(mythread);
        thread.start();
        while(true){
            System.out.println("Main线程在运行");
        }
    }}
     class MyThread1 implements Runnable{
    public void run(){
        while(true){
            System.out.println("MyThread线程在运行");
        }
    }}

