package com.asiainfo.chapter1.liangzhiqiang.day7;

/**
 * Created by 君不悔 on 2017/8/1.
 */
public class Example2 {
    public static void main(String[]args){
        Runtime rt=Runtime.getRuntime();
        System.out.println("处理器个数："+rt.availableProcessors()+"个");
        System.out.println("空闲内存数量："+rt.freeMemory()/1024/1024+"M");
        System.out.println("最大可用内存数量："+rt.maxMemory()/1024/1024+"M");

    }
}
