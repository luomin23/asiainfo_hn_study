package com.asiainfo.chapter1.zhangyang.week4_day_05;

/**
 * Created by 11 on 2017/8/4.
 */
 class ThreadDemo01 extends Thread {
    private String name;
    public ThreadDemo01(){
    }
    public ThreadDemo01(String name){
        setName(name);
    }
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("当前运行的线程："+getName()+",i="+i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo01 threadDemo01 = new ThreadDemo01("线程-1");
        ThreadDemo01 threadDemo02 = new ThreadDemo01("线程-2");
        threadDemo01.start();
        threadDemo02.start();
    }
}
