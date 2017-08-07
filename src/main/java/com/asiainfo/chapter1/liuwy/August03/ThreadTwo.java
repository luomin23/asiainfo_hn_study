package com.asiainfo.chapter1.liuwy.August03;

/**
 * Created by LENOVO on 2017/8/3.
 */
public class ThreadTwo extends Thread{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("AAA");
        }
    }
}
