package com.asiainfo.chapter1.zhangyang.week4_day_03;

/**
 * Created by 11 on 2017/8/2.
 */
/*
在程序中加入异常语句，当有异常发生时也不会中断程序的运行
 */
public class ExceptionDeno01 {
    public static void main(String[] args)  {
        int i[] = {1,2,3};
        try {
            System.out.println("i[0]:" + i[0]);
            System.out.println("i[3]:" + i[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("异常信息："+e);
        }finally {
            System.out.println("****无论是否有异常，都会执行finally语句****");
        }
        System.out.println("i[1]:"+i[1]);
    }
}
