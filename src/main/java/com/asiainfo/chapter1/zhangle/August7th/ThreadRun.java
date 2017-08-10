package com.asiainfo.chapter1.zhangle.August7th;

import static java.lang.Thread.sleep;

/**
 * Created by del on 2017/8/7.
 */
public class ThreadRun implements Runnable {
    private  String name;
    public ThreadRun(String name){
        this.name=name;
    }
    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println(name+"运行:"+i);
            try {
                sleep((int)Math.random()*5);
            } catch (InterruptedException e) {
                System.out.println("中断异常；");
            }
        }
    }
}
