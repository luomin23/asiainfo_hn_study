package com.asiainfo.chapter1.luhui.luhui2;

/**
 * Created by 18237161432 on 2017/7/25.
 * 2、成绩等级输出程序
 */
import java.util.*;
public class score {
    public static void main(String[] args){

        for(int i=0;i<100;i++) {
            System.out.println("请输入该学员的分数（0-100）");
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            if (t<=100 && t >= 0) {
                if (t >= 90) {
                    System.out.println("A");
                }
                if (t >= 80 && t < 90) {
                    System.out.println("B");
                }
                if (t >= 60 && t < 80) {
                    System.out.println("C");
                }
                if (t >= 0 && t < 60) {
                    System.out.println("D");
                }

            } else {
                System.out.println("请输入0-100以内的分数");
            }

        }



    }
}
