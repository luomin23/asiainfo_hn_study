package com.asiainfo.chapter1.zhangyang.week4_day_05;

/**
 * Created by 11 on 2017/8/4.
 */
 public class RunnableDemo01 implements Runnable{
    private String name;
    public RunnableDemo01(){
    }
    public RunnableDemo01(String name){
        setName(name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("当前运行的线程："+getName()+",i="+i);
        }
    }
    public static void main(String[] args) {
        RunnableDemo01 r1 = new RunnableDemo01("线程-1");
        RunnableDemo01 r2 = new RunnableDemo01("线程-2");
        Thread t1 = new Thread( r1);
        Thread t2 = new Thread( r2);
        Thread t3 = new Thread( r2);
        t1.start();
        t2.start();
        t3.start();
    }

}
