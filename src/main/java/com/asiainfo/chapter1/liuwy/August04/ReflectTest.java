package com.asiainfo.chapter1.liuwy.August04;

/**
 * Created by LENOVO on 2017/8/4.
 */
public class ReflectTest {
    //测试运行时间
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        for (int x=0;x<100000;x++){
            System.out.println(x);
        }
        long end=System.currentTimeMillis();
        System.out.println("共耗时："+(end-start)+"毫秒");

    }
}
