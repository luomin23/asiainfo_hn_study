package com.asiainfo.chapter1.liangzhiqiang.day9;

/**
 * Created by 君不悔 on 2017/8/3.
 */
public class Example1 {
    public static void main(String[]args){
        MyThread myThred=new MyThread();
        myThred.start();
        while (true){
            System.out.println("main()方法在运行");
        }
    }
}
class MyThread extends Thread{
    public void run(){
        while (true){
            System.out.println("MyThread类的run（）方法在运行");
        }
    }
}
