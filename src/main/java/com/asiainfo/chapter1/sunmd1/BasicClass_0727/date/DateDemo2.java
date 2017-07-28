package com.asiainfo.chapter1.sunmd1.BasicClass_0727.date;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/*
 * 算一下你来到这个世界多少天?
 * 
 * 分析：
 * 		A:键盘录入你的出生的年月日
 * 		B:把该字符串转换为一个日期
 * 		C:通过该日期得到一个毫秒值
 * 		D:获取当前时间的毫秒值
 * 		E:用D-C得到一个毫秒值
 * 		F:把E的毫秒值转换为年
 * 			/1000/60/60/24
 */
public class DateDemo2 {
	public static void main(String[] args) throws ParseException {
		System.out.println("请输入你的出生日期：");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		Date d = DateUtil.stringToDate(s, "yyyy-MM-dd");
		long myTime = d.getTime();
		
		//获得当前时间的毫秒值
		long nowTime = System.currentTimeMillis();
		
		long day =  (nowTime - myTime)/1000/60/60/24;
		System.out.println(day);
		
		
	}
	

}
