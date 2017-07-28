package com.asiainfo.chapter1.dongwenchao.day02.lianxi;

import java.util.Scanner;

/**
 * Created by 超超 on 2017/7/28 0028.
 */
public class deom4 {
    public static void main(String[] agrs){
        Scanner a=new Scanner(System.in);
        System.out.println("将开始十次加法测试...");
        int fenshu=0;
        for (int i=1;i<=10;i++){
            int d=(int)(Math.random()*1000);
            int d2=(int)(Math.random()*1000);
            int f=d+d2;
            System.out.println("(" + i + "). " + d + " + " + d2 + " = ?");
            System.out.print("请输入答案（输入-1退出）： ");
            int p=a.nextInt();
            if (p==f){
                System.out.print("回答正确！\n ");
                fenshu+=10  ;
            }else if (p==-1){
                break;
            }else
                System.out.println("Error!");
            continue;

        }
        System.out.println("此次测验结束，你的分数是：" + fenshu);
}
}
