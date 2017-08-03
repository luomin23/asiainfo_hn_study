package com.asiainfo.chapter1.wangjz.java.javaday1.javaday8;

/**
 * Created by wjz123456 on 2017/8/3.
 */
public class ThreadUse extends Thread {
    private String name;
    private int a;
    public ThreadUse(String name,int a,int ii){
        super(name);
        this.a=a;
        setPriority(ii);
    }
//    public ThreadUse(String name){
//        this(name,0);
//    }
    public void run(){
        int i=a;
        System.out.print(getName());
        while (i<200){
            System.out.print(i+" ");
            i+=2;
        }
        System.out.println(getName()+" 结束");
    }
    public void run1(){
        for(int i=0;i<100;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public void run2(){
        for(int i=1;i<100;i+=2){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        ThreadUse t1=new ThreadUse("奇数",1,10);
        ThreadUse t2=new ThreadUse("偶数",2,5);
      //  ThreadUse t3=new ThreadUse("ww");
        t1.start();
        t2.start();


        //t3.start();
    }
}
