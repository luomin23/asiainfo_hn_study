﻿package com.asiainfo.chapter1.chenjn;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
public class ScannerDemo {
    public static Scanner scanner = new Scanner(System.in);
    public static double price;//默认是0.0
    public static int n;//默认0
    public static double getMoney;
    public static double total;

    public static void main(String[] args){
        System.out.println("请输入单价（￥）：");
        price = scanner.nextDouble();
        System.out.println("请输入数量：");
        n = scanner.nextInt();
        System.out.println("请输入金额（￥）：");
        getMoney = scanner.nextDouble();
        if(price * n >= 500)
            total = price * n * 0.8;
        else
            total = price * n;
        System.out.println("应收金额为：￥"+String.format("%.1f",total)+",找零为：￥"+String.format("%.1f",getMoney-total));


    }


}
