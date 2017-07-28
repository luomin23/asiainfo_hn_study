package com.asiainfo.chapter1.sunmd1.s0725;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
public class AddDemo {
    public static void main(String[] args){

        Random random = new Random();
        System.out.println("将开始10道加法测试...");
        Scanner scanner = new Scanner(System.in);
        int score=0;
        for(int i=1;i<=10;i++){
            int a1 = random.nextInt(100);
            int a2 = random.nextInt(100);
            System.out.println("("+i+")."+a1+" + "+a2+" = ?");
            System.out.print("请输入答案（输入-1退出）：");
            int sum = scanner.nextInt();
            if(sum == -1){
                break;
            }else if(sum == (a1+a2)){
                System.out.println("Correct!");
                score+=10;
                continue;
            }else {
                System.out.println("Error!");
            }

        }

        System.out.println("此次测试结束，你的分数是:"+score);
    }
}
