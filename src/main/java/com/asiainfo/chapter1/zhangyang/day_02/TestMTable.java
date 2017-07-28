package com.asiainfo.chapter1.zhangyang.day_02;

/**
 * Created by 11 on 2017/7/25.
 */
//使用递归算法打印九九乘法表
public class TestMTable {
    public static void method(int i) {
        if (i == 1) {
            System.out.print("1*1=1\t\n");
        } else {
            method(i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        method(9);
    }
}
