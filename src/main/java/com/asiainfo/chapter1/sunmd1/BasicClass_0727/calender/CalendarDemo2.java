package com.asiainfo.chapter1.sunmd1.BasicClass_0727.calender;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 获取任意一年的二月有多少天
 * 
 * 分析：
 * 		A:键盘录入任意的年份
 * 		B:设置日历对象的年月日
 * 			年就是A输入的数据
 * 			月是2
 * 			日是1
 * 		C:把时间往前推一天，就是2月的最后一天
 * 		D:获取这一天输出即可
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("请输入年份：");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		c.set(year,2,1);//某年3月1号
		c.add(c.DATE,-1);//往前推一天
		System.out.println(year+"年2月有"+c.get(c.DATE)+"天");
	}

}
