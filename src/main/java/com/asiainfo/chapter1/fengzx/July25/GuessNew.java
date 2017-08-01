package com.asiainfo.chapter1.fengzx.July25;

import java.util.Scanner;

/**
 * Created by fengzx on 2017/7/27.
 */
public class GuessNew {
    public static void main(String[] args){
        int guessname = (int)(Math.random()*1000)+1;

        while (true){
            System.out.println("请输入你猜测的数字（1-1000），退出请按0：");
            Scanner input = new Scanner(System.in);
            int i = input.nextInt();

            if(i > guessname && i > 0 && i <= 1000){
                System.out.println("太大了！");
            }else if (i < guessname && i > 0 && i <= 1000){
                System.out.println("太小了！");
            }else if (i<0||i>1000){
                System.out.println("请输入1-1000以内的数字！");
            }else if (i == 0) {
                System.out.println("真遗憾，下次再挑战吧！");
                break;
            }else if (i == guessname){
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
    }
}
