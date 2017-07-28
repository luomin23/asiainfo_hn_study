package com.asiainfo.chapter1.sunmd1.BasicClass_0727.math;

import java.util.Scanner;

/*
 * 需求：请设计一个方法，可以实现获取任意范围内的随机数。
 * 
 * 分析：
 * 		A:键盘录入两个数据。
 * 			int strat;
 * 			int end;
 * 		B:想办法获取在start到end之间的随机数
 * 			我写一个功能实现这个效果，得到一个随机数。(int)
 * 		C:输出这个随机数
 */

public class MathDemo {

	public static void main(String[] args) {
		System.out.println("请输入范围：");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int start = Integer.parseInt(str.split("-")[0]);
		int end = Integer.parseInt(str.split("-")[1]);
		System.out.println(getNum(start, end));
	}
	
	
	//获取任意范围的随机数
	public static int getNum(int start, int end){
		return (int) (Math.random()*(end - start +1)) +start;
	}
	
}
