package com.asiainfo.chapter1.liangzhiqiang.day10;

/**
 * Created by 君不悔 on 2017/8/4.
 */
class DamonThread implements Runnable{          //创建DamonThread类，实现Runnable接口
    public void run(){                         //实现接口中的run（）方法
        while (true){
            System.out.println(Thread.currentThread().getName()+"----isrunning");
        }
    }
}
public class Example1 {
    public static void main(String[]args){
        System.out.println("main线程是后台线程吗？"+Thread.currentThread().isDaemon());
        DamonThread dt=new DamonThread();                //创建一个DamonThread对象dt
        Thread t=new Thread(dt,"后台线控");              //创建线程t共享dt资源
        System.out.println("t线程默认是后台线控吗？"+t.isDaemon());
        t.setDaemon(true);                              //将线程t设置为后台先合线程
        t.start();                                      //调用start（）方法开启线程t
        for (int i=0;i<10;i++){
            System.out.println(i);
        }

    }

}
