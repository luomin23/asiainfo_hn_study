package com.asiainfo.chapter1.zhangyang.week4_day_05;

/**
 * Created by 11 on 2017/8/4.
 */
class Ticket1 implements Runnable{
    private int ticket=10;
    public Ticket1(){

    }
    @Override
    public void run() {
        while (ticket>0){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"卖出的第"+(ticket--)+"张门票");
            }
        }
    }
}
public class RunnableDemo02 {
    public static void main(String[] args) {
        Ticket1 window = new Ticket1();
        Thread t1 = new Thread(window,"第一窗口");
        Thread t2 = new Thread(window,"第二窗口");
        t1.start();
        t2.start();
    }
}
