package com.asiainfo.chapter1.luhui.luhui2;

/**
 * Created by 18237161432 on 2017/7/25.
 * 3、猜数字游戏
 */
import java.util.*;
public class math {
    public static void main(String[] args){
       loop1: for (int i=0;i<1000;i++){//设置循环节点
        System.out.println("请输入你猜测的数字（1-1000）,退出请按0：");
        Scanner m=new Scanner(System.in);
        int n=m.nextInt();
        if (n>0&&n<666){
            System.out.println("太小了");
        }
        if (n>666){
            System.out.println("太大了");
        }
        if (n==666){
            System.out.println("猜对了");
            break loop1;
        }
            if (n==0){
                break loop1;//跳出循环
            }
    }
}
}
