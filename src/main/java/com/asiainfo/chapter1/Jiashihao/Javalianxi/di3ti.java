package com.asiainfo.chapter1.Jiashihao.Javalianxi;

import java.util.Scanner;

public class di3ti {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你猜测的数字(1-1000)退出请按0");
		int a = sc.nextInt();
		int i = 5;
		while (a != i && i < 10) {
			System.out.println(a > i ? "太小了" : "太大了");
			a = sc.nextInt();
			if (a == 0) {
				System.out.println("真遗憾，下次再挑战吧！");
				break;
			}
			System.out.println("恭喜，你猜对了");


		}
	}
}

