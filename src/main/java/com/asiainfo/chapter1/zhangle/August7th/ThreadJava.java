package com.asiainfo.chapter1.zhangle.August7th;

/**
 * Created by del on 2017/8/7.
 * 调用Thread对象的start()方法来运行多线程代码
 * Thread类还是实现Runnable接口来实现多线程，
 * 最终还是通过Thread的对象的API来控制线程的
 */
public class ThreadJava{

    public static void main(String[] args) {
        ThreadOne t1=new ThreadOne("A");
        ThreadOne t2=new ThreadOne("B");
        t1.start();
        t2.start();
        new Thread(new ThreadRun("C")).start();

    }
}
