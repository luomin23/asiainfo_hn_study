package com.asiainfo.chapter1.zhangyang.week4_day_05;

import java.util.Date;

/**
 * Created by 11 on 2017/8/4.
 */
/*
线程休眠
 */
class ThreadDemo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("当前运行的线程："+Thread.currentThread().getName()+",i="+i+",时间："+(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class RunnableDemo03 {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread t1 = new Thread(threadDemo,"线程-1");
        Thread t2 = new Thread(threadDemo,"线程-2");
        Thread t3 = new Thread(threadDemo,"线程-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
