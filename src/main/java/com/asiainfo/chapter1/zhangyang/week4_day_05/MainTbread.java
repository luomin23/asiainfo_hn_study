package com.asiainfo.chapter1.zhangyang.week4_day_05;

/**
 * Created by 11 on 2017/8/4.
 */
public class MainTbread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("当前运行的线程："+Thread.currentThread()+"i="+i);
        }
    }
    public static void main(String[] args) {
        Thread mt = Thread.currentThread();//获取主线程
        System.out.println("线程信息："+mt);//输出主线程信息
        System.out.println("线程名称："+mt.getName());//取得主线程名称
        mt.setName("主线程");
        System.out.println("线程名称："+mt.getName());
        MainTbread mainTbread = new MainTbread();
        Thread thread = new Thread(mainTbread);
        thread.start();
        mainTbread.run();
    }
}
