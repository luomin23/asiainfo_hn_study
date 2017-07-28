package com.asiainfo.chapter1.sunmd1.BasicClass_0727.calender;

import java.util.Calendar;

/**
 * 抽象类：Calendar.getIns..
 * get
 * set
 * add
 * @author Administrator
 *
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//默认获取当前时间
		Calendar calendar = Calendar.getInstance();
		System.out.println("当前时间："+calendar.get(calendar.YEAR)+"-"+(calendar.get(calendar.MONTH)+1)+"-"+calendar.get(calendar.DATE));
		
		//设置时间
		calendar.set(1994, 10,1);//代表1994年11月1，month从0开始
		calendar.add(Calendar.DATE, -1);
		System.out.println(calendar.get(calendar.YEAR)+"-"+(calendar.get(calendar.MONTH)+1)+"-"+calendar.get(calendar.DATE));
		
	}

}
