package com.asiainfo.chapter1.dongwenchao.day03;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by 超超 on 2017/7/28 0028.
 */
public class demo7 {
    public static void main(String[] args){
        int game;
        int guess;
        int cishu=0;
        Random a=new Random();
        game=a.nextInt(100)+1;
        Scanner b=new Scanner(System.in);
        do {
            System.out.println("请输入输入的数字（1-100）");
            guess=b.nextInt();
            cishu++;
            if (guess==game)
                break;
            if (guess>game)
                System.out.println("猜的数字大了");
             else
                System.out.println("猜的数字小了");
        }while (guess!=game);
        System.out.println("恭喜你猜对了，猜了"+cishu+"次。");
    }
}
