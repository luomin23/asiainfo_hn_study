package com.asiainfo.chapter1.xushuo.x0802_03.Inout;

import java.util.Scanner;

/**
 * Created by root on 2017/8/3.
 * 检测邮箱正确性
 */
public class ScannerDemo03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);                                    //创建scanner实例
        String pattern ="^[a-zA-Z0-9_\\.]+@[a-zA-Z0-9-]+[\\.a-zA-Z]+$";         //定义正则式
        System.out.println("请输入邮箱地址: ");
        String mail =null;
        if(scan.hasNext(pattern)) {
            mail = scan.next();
            System.out.println("您输入的邮箱："+mail);
        }else{
            System.out.println("您输入的邮箱不正确！！");
        }
    }
}
