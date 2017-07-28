package com.asiainfo.chapter1.luhui.luhui2;

/**
 * Created by 18237161432 on 2017/7/25.
 * 1、收银柜台收款程序
 */
import java.util.*;
import java.util.Scanner;
public class shopping {
    public static void main(String[] args){
        for (int y=0;y<1000;y++){
        Scanner price =new Scanner(System.in);
        System.out.println("请输入物品单价:");
        double i=price.nextDouble();
        System.out.println("请输入物品数量:");
        int s=price.nextInt();
        System.out.println("请输入金额:");
        double m=price.nextDouble();
        double sum=s*i;

        System.out.println(String.format("应收金额为:" +sum+"找零"+(m-sum)));
        if (sum>500) {
            sum=sum*0.8;
            System.out.println(String.format("应收金额为:" + sum+"找零"+(m-sum)));//formst保留两位小数。
        }
    }
}
}
