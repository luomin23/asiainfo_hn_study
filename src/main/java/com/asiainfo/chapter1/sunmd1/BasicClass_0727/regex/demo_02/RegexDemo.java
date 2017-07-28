package com.asiainfo.chapter1.sunmd1.BasicClass_0727.regex.demo_02;

import java.util.Scanner;

/*
 * 分割功能
 *		String类的public String[] split(String regex)
 *		根据给定正则表达式的匹配拆分此字符串。 
 *
 * 举例：
 * 		百合网，世纪佳缘,珍爱网,QQ
 * 		搜索好友
 * 			性别：女
 * 			范围："18-24"
 * 
 * 		age>=18 && age<=24
 */
public class RegexDemo {
	
	public static void main(String[] args) {
		//定义一个年龄范围
		String ages = "18-24";
		String[] ageArr = ages.split("-");
		int startAge = Integer.parseInt(ageArr[0]);
		int endAge = Integer.parseInt(ageArr[1]);
		System.out.println("请输入年龄：");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if(age>=startAge && age<=endAge){
			System.out.println("你就是我想要的！");
		}else{
			System.out.println("NO！");
		}
	}
	
	

}
