package com.asiainfo.chapter1.wangjz.java.javaday1.javaday8;

/**
 * Created by wjz123456 on 2017/8/3.
 */
public class RunnableUse implements Runnable {
    private int a;
    public RunnableUse(int a){
        this.a=a;
    }
    public void run(){
        int i=a;
        while(i<200){
            System.out.print(i+" ");
            i+=2;
        }
        System.out.println("结束");
    }

    public static void main(String[] args) {
        RunnableUse o=new RunnableUse(1);
        RunnableUse e=new RunnableUse(2);
        Thread t2=new Thread(e);
        Thread t1=new Thread(o,"奇数");
        t1.start();
        t1.setPriority(10);
        t2.start();
    }
}
