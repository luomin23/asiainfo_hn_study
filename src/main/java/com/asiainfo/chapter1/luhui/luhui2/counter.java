package com.asiainfo.chapter1.luhui.luhui2;

import java.util.Random;

/**
 * Created by 18237161432 on 2017/7/25.
 * 4、随机加法运算器
 */
import java.util.*;
public class counter {
    public static void main(String[] args){
        int z=0;
        look:for (int i=1;i<11;i++){
        int number=new Random().nextInt(100);
        int number1=new Random().nextInt(100);
        int sum=number+number1;
        System.out.println("("+i+")"+number+"+"+number1+"="+"?");
        System.out.print("请输出答案，按（-1）退出:");
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        if (y==sum){
            System.out.println("Correct");
            z+=10;
        }
        if (y==-1){
            break look;
        }
        if (y!=sum){
            System.out.println("Error");
        }

    }
        System.out.println("此次测验结束，你的分数是："+z);
}}
