package com.asiainfo.chapter1.zhangyang.week4_day_04;

import java.util.Scanner;

/**
 * Created by 11 on 2017/8/3.
 */
/*
从键盘获取数据
 */
public class ScannerDemo01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        float f = 0.0F;
        System.out.println("请输入int型整数:");
        if (scan.hasNextInt()){//判断输入的数据是否为int类型
            num=scan.nextInt();//输入int类型
        }else {
            System.out.println("输入的不是整数！/n程序退出。。。。");
            System.exit(0);
        }
        System.out.println("请输入float型小数：");
        if(scan.hasNextFloat()){
            f = scan.nextFloat();
        }else{
            System.out.println("输入的不是小数！/n程序结束");
            System.exit(0);
        }
    }
}
