package com.asiainfo.chapter1.dongwenchao.day02.lianxi;

import java.util.Scanner;

/**
 * Created by 超超 on 2017/7/27 0027.
 */
public class demo3 {
    public static void run(int c){
        Scanner b=new Scanner(System.in);
        int a= (int) (Math.random() * 1000) + 1;
        while(c !=a){
            if (c>a){
                System.out.println("太大了!");
            }else if (c==0){
                break;
            }else if (c<a){
                System.out.println("太小了!");
            }
            System.out.print("请输入你猜测的数字(1-1000)，退出请按0：");
            c = b.nextInt();
            if(c == a) {
                System.out.println("恭喜，你猜对了!");
            }else{
                System.out.println("真遗憾，下次再挑战吧!");
            }

        }
    }
    public static void main(String[] args){
        Scanner b=new Scanner(System.in);
        System.out.println("请输入你猜的数字(1-1000)，退出请按0");
        int c=b.nextInt();
        run(c);
    }
}
