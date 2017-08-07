package com.asiainfo.chapter1.zhangle.August7th;

import static java.lang.Thread.sleep;

/**
 * Created by del on 2017/8/7.
 */
public class ThreadOne extends Thread {
   private String name;
   public ThreadOne(String name){
       this.name=name;
   }
   public void run(){
       for(int i=0;i<3;i++){
           System.out.println(name+"运行:"+i);
           try {
               sleep((int)Math.random()*10);
           } catch (InterruptedException e) {
               System.out.println("中断异常；");
           }
       }
   }


}