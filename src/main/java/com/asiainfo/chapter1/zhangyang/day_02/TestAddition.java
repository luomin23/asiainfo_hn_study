package com.asiainfo.chapter1.zhangyang.zyjavaday_01.day_02;

/**
 * Created by 11 on 2017/7/25.
 */
import java.util.Scanner;
public class TestAddition {
    public static void main(String[] args) {
        System.out.println("将开始10次加法测试...");
        Scanner scan = new Scanner(System.in);
        // 记录分数
        int Total = 0;
        // 构建 10 次循环
        for (int i = 1; i <= 10; i++) {
            // 随机生成两个加数
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);
            int result = a + b;
            // 输出需要计算的加法表达式
            System.out.println("(" + i + "). " + a + " + " + b + " = ?");
            System.out.print("请输入答案（输入-1退出）： ");
            // 读入结果
            int answer = scan.nextInt();
            // 判断对错
            if (answer == -1) {
                break;
            } else if (answer != result) {
                System.out.println("Error!");
                continue;
            } else {
                Total += 10;
                System.out.println("Correct!");
            }
        }
        scan.close();
        System.out.println("此次测验结束，你的分数是：" + Total);
    }
}
