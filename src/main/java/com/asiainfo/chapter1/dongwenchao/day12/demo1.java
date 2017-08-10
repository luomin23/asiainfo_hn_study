package com.asiainfo.chapter1.dongwenchao.day12;

/**
 * Created by 超超 on 2017/8/7 0007.
 */
public class demo1 implements Runnable{
    private int i;
    public demo1(int i){
        this.i=i;
    }
    //实现接口的方法
    public void run(){
        System.out.println();
        while (i<200){
            System.out.print(i+" ");
            i+=2;
        }
        System.out.println("结束！");
    }
    public static void main(String[]args){
        //有线程体的目标对象
        demo1 b=new demo1(1);
        //创建线程对象
        Thread t1=new Thread(b,"基数线程");
        t1.start();
        demo1 b1=new demo1(2);
        Thread t2=new Thread(b1,"偶数线程");
        t2.start();
    }
}
