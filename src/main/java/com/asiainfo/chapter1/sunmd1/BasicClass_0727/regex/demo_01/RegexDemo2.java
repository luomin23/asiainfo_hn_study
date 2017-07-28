package com.asiainfo.chapter1.sunmd1.BasicClass_0727.regex.demo_01;

import java.util.Scanner;

/**
 * 判断功能：mathches
 * 问题：校验手机号
 * 分析：1.11位,1开头
 * 		2.前两位3/8
 * 		3.都是数字
 * 
 * @author Administrator
 *
 */
public class RegexDemo2 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入手机号：");
		String tel = scanner.nextLine();
		System.out.println(tel.matches("1[38]\\d{9}"));
	}
}
