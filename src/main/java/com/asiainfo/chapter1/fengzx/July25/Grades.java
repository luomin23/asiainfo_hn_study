package com.asiainfo.chapter1.fengzx.July25;

import java.util.Scanner;

/**
 * Created by fengzx on 2017/7/25.
 */
public class Grades {
    public static void main(String[] args){
        System.out.println("请输入该学员的分数(0-100):");
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();

        if (grade<0||grade>100){
            System.out.println("请输入0-100以内的分数！");
        }else {
            switch (grade / 10) {
                case 10:
                case 9:
                    System.out.println("该学员的分数等级为A");
                    break;
                case 8:
                    System.out.println("该学员的分数等级为B");
                    break;
                case 7:
                case 6:
                    System.out.println("该学员的分数等级为C");
                    break;
                default:
                    System.out.println("该学员的分数等级为D");
                    break;
            }
        }
    }
}
