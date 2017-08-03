package com.asiainfo.chapter1.luhui.luhui9;

/**
 * Created by 18237161432 on 2017/8/3.
 */
public class Thread02 {
    public static void  main(String [] args){
        TicketWindow tw=new TicketWindow();
        new Thread(tw,"窗口1").start();
        new Thread(tw,"窗口2").start();
        new Thread(tw,"窗口3").start();
        new Thread(tw,"窗口4").start();
    }
}
class TicketWindow implements Runnable{
    private  int tickets=100;//运行的效果是只有一个或者两个线程运行，因为参数比较小，
    // CPU分配给一个线程的时间足够支持这个线程完成任务吗，可以增大参数来使得四个线程都进行。
    public void run(){
        while(true){
            if(tickets>0){
                Thread th=Thread.currentThread();//currentThread()方法获取当前线程的实例对象。
                String th_name=th.getName();//getName获取当前线程的名字;
                System.out.println(th_name+"正在发售第 "+tickets--+"张票");

            }
        }
    }
}
