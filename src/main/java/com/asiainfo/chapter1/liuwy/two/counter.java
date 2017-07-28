package com.asiainfo.chapter1.liuwy.two;

import java.util.Scanner;

/**
 * Created by LENOVO on 2017/7/25.
 */
public class counter {
    public  static void main( String[] args){
        float x,y,z;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入单价（￥）");
        x=scanner.nextFloat();
        System.out.println("请输入数量（￥）");
        y=scanner.nextFloat();
        System.out.println("请输入金额（￥）");
        z=scanner.nextFloat();
        float sum=x*y;
        if(sum>=500){
            sum=sum*4/5;
        }
        float zhao=z-sum;
        System.out.println("应收金额为：￥"+sum+",找零为：￥"+zhao);


    }
}
