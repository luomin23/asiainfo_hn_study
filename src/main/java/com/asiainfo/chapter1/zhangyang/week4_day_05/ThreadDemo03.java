package com.asiainfo.chapter1.zhangyang.week4_day_05;

/**
 * Created by 11 on 2017/8/4.
 */
class Ticket extends Thread{
    private int ticket=10;
    private String name;
    public Ticket(){
    }
    public Ticket(String name){
        setName(name);
    }
    public void run(){
        while (ticket>0){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"卖出第"+(ticket--)+"张门票");
            }
        }
    }
}
public class ThreadDemo03 {
    public static void main(String[] args) {
        Ticket window1 = new Ticket("第一窗口");
        Ticket window2 = new Ticket("第二窗口");
        window1.start();
        window2.start();
    }
}
