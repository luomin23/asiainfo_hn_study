package com.asiainfo.chapter1.sunmd1.s0725;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
public class DataDemo {
    //结果
    int n = 159;
    //猜测数字
    int m;

    public static void main(String[] args){
        DataDemo data = new DataDemo();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("请输入你猜测的数字（0-1000）,退出请按0：");
            data.m = scanner.nextInt();
            if(data.m == 0){
                System.out.println("真遗憾，下次再来挑战吧！");
                break;
            }else if(data.m >159){
                System.out.println("太大了：");
            }else if(data.m <159){
                System.out.println("太小了：");
            }else if(data.m == 159){
                System.out.println("恭喜你，猜对了！");
                break;
            }

        }
    }

}
