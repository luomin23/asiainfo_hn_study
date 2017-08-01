package com.asiainfo.chapter1.fengzx.July25;

import java.util.Scanner;

/**
 * Created by fengzx on 2017/7/25.
 */
public class Addition {
    public static void main(String[] args){
        System.out.println("将开始10次加法测试…");
        int i=0;
        int grade=0;
        while (i<10) {
            int number1 = (int) (Math.random() * 100);
            int number2 = (int) (Math.random() * 100);
            i++;
            System.out.println("(" + i + ")" + number1 + "+" + number2 + "= ?");
            System.out.print("请输入答案（输入-1退出）：");
            Scanner input = new Scanner(System.in);
            int add=input.nextInt();
            int number;
            number = number1 + number2;
            if (add==number){
                System.out.println("Correct!");
                grade+=10;
            }else if (add!=number){
                if (add==-1){
                    break;
                }
                System.out.println("Error!");
            }
        }
        System.out.println("此次测验结束，你的分数是："+grade);
    }
}
