package com.asiainfo.chapter1.wangjz.java.javaday1.javaday2;

import java.util.Scanner;

/**
 * Created by wjz123456 on 2017/7/25.
 */
public class ArrayMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.print("数组中的数据为：");
        for(int i=0;i<10;i++){
            a[i]=(int) (Math.random() * 100);
            System.out.print(+a[i]+"  ");
        }
        for(int i=1;i<10;i++){
           if(a[0]<a[i]){
              a[0]=a[i];
           }
       }
        System.out.println();
        System.out.print("最大值为：");
        System.out.println(a[0]);
    }
}
