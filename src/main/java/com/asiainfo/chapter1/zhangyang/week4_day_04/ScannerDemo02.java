package com.asiainfo.chapter1.zhangyang.week4_day_04;

import java.util.Scanner;

/**
 * Created by 11 on 2017/8/3.
 */
public class ScannerDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "^[a-zA-Z0-9_\\.]+@[a-zA-Z0-9-]+[\\.a-zA-Z]+$";
        System.out.println("请输入你的邮箱地址：");
        String mail=null;
        if (scanner.hasNext(pattern)) {
            mail=scanner.next();
            System.out.println("您输入的邮箱："+mail);
        }else{
            System.out.println("您输入的格式不正确！");
        }
    }
}
