package com.asiainfo.chapter1.liangzhiqiang;
/**
 * Created by 君不悔 on 2017/7/24.
 */

public class elselt {
    public static void main(String[] arga) {
        double d = Math.random();//double类型，大小在【0.1】区间内
        int i = (int) (d * 5);//强制转换类型。大小区间【0.4】，如0.12*5=0.6.则转为int型后取整值为0
        System.out.println(i);
        if (i > 3) {
            System.out.println("这是一个大数");
        } else {
            System.out.println("这是一个小数");

        }
    }
}