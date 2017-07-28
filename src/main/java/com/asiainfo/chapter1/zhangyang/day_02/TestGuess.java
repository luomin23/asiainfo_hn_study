package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_02;

/**
 * Created by 11 on 2017/7/25.
 */
import java.util.Scanner;
public class TestGuess {
    public static void main(String[] args) {
        int number = 233;
        System.out.print("请输入你猜测的数字(1-1000)，退出请按0：");
        Scanner scanner = new Scanner(System.in

        );
        int guess = scanner.nextInt();
        while (guess != number) {
            if(guess == 0){
                break;
            }
            else if (guess > number) {
                System.out.println("太大了!");
            }
            else if (guess < number) {
                System.out.println("太小了!");
            }
            System.out.print("请输入你猜测的数字(1-1000)，退出请按0：");
            guess = scanner.nextInt();
        }
        if(guess == number) {
            System.out.println("恭喜，你猜对了!");
        }else{
            System.out.println("真遗憾，下次再挑战吧!");
        }
        scanner.close();
    }
}
