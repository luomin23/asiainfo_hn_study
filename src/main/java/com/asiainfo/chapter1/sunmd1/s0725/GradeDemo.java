package com.asiainfo.chapter1.sunmd1.s0725;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
public class GradeDemo {
    double score;
    public static void main(String[] args){
        GradeDemo gd = new GradeDemo();
        System.out.println("请输入分数（0-100）：");
        Scanner scanner = new Scanner(System.in);

        while (true){
            gd.score = scanner.nextDouble();
            if(gd.score>100){
                System.out.println("请输入0到100以内的分数：");
            }else {
                if(gd.score>=90)
                    System.out.println("A");
                else if(gd.score>=80)
                    System.out.println("B");
                else if(gd.score>=60)
                    System.out.println("C");
                System.out.println("D");
                break;
            }
        }

    }

}
