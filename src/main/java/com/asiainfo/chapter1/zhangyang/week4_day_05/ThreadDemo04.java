package com.asiainfo.chapter1.zhangyang.week4_day_05;

/**
 * Created by 11 on 2017/8/7.
 */
/*
线程的优先级
 */
class ThreadDemo0 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("当前运行的线程："+Thread.currentThread().getName()+",i="+i);
        }
    }
}
public class ThreadDemo04 {
    public static void main(String[] args) {
        ThreadDemo tm = new ThreadDemo();
        Thread t1 = new Thread(tm,"线程-1");
        Thread t2 = new Thread(tm,"线程-2");
        Thread t3 = new Thread(tm,"线程-3");
        Thread t4 = new Thread(tm,"线程-4");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(2);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
