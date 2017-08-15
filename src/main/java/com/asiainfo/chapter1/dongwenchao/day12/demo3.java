package com.asiainfo.chapter1.dongwenchao.day12;

/**
 * Created by 超超 on 2017/8/7 0007.
 */
public class demo3 implements Runnable {
    @Override
    public void run() {
        System.out.println("我是一个线程");
    }
    public static void main(String[]args){
        demo3 b=new demo3();
        Thread a=new Thread(b);
        a.run();
    }
}
