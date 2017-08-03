package com.asiainfo.chapter1.wangjz.java.javaday1.javaday8;

/**
 * Created by wjz123456 on 2017/8/3.
 */
public class SynchronizedUse extends Thread {
    private String name;

    static int a=20;
    public SynchronizedUse(String name){
        this.name=name;
        start();
    }
    public void  run(){
            try {
                for(int i=0;i<10;i++) {
                    action(name);
                Thread.sleep(60);}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    public synchronized void action(String name){
        System.out.println(name+"抢到了"+a);
        a--;
    }
    public static void main(String[] args) {
        SynchronizedUse s=new SynchronizedUse("w");
        SynchronizedUse y=new SynchronizedUse("q");
    }
}
