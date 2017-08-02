package com.asiainfo.chapter1.fengzx.July25;

import java.util.Scanner;

/**
 * Created by fengzx on 2017/7/25.
 */
public class Guess {
    public static void main(String[] args){
        int number = (int)(Math.random()*1000+1);

        System.out.println("请输入你猜测的数字（1-1000），退出请按0：");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();

        while (i!=number){
            if (i == 0){
                System.out.println("真遗憾，下次再挑战吧！");
                break;
            } else if (i<0||i>1000){
                System.out.println("请输入1-1000以内的数字！");
                i = input.nextInt();
            }else {
                System.out.println(i>number?"太大了！":"太小了！");
                System.out.println("请输入你猜测的数字（1-1000），退出请按0：");
                i = input.nextInt();
            }
        }
        if(i==number) {
            System.out.println("恭喜你，猜对了！");
        }
    }
}
