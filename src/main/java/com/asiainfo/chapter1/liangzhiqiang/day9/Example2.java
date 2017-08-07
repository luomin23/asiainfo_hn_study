package com.asiainfo.chapter1.liangzhiqiang.day9;

/**
 * Created by 君不悔 on 2017/8/3.
 */
public class Example2 {
    public static void main(String[]args){
        TicketWindow tw =new TicketWindow();
        new Thread(tw,"窗口 1").start();
        new Thread(tw,"窗口 2").start();
        new Thread(tw,"窗口 3").start();
        new Thread(tw,"窗口 4").start();

    }
}
class TicketWindow implements Runnable{
    private int tickets=100;
    public void run(){
        while (true){
            if (tickets>0){
                Thread th=Thread.currentThread();
                String th_name=th.getName();
                System.out.println(th_name+"正在发售"+tickets--+"张票");
            }
        }
    }
}
