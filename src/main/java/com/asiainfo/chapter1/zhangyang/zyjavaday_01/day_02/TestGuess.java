package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_02;

/**
 * Created by 11 on 2017/7/25.
 */
import java.util.Scanner;
public class TestGuess {
    public static void main(String[] args) {
        int number = 233;
        System.out.print("��������²������(1-1000)���˳��밴0��");
        Scanner scanner = new Scanner(System.in

        );
        int guess = scanner.nextInt();
        while (guess != number) {
            if(guess == 0){
                break;
            }
            else if (guess > number) {
                System.out.println("̫����!");
            }
            else if (guess < number) {
                System.out.println("̫С��!");
            }
            System.out.print("��������²������(1-1000)���˳��밴0��");
            guess = scanner.nextInt();
        }
        if(guess == number) {
            System.out.println("��ϲ����¶���!");
        }else{
            System.out.println("���ź����´�����ս��!");
        }
        scanner.close();
    }
}
