package com.asiainfo.chapter1.sunmd1.BasicClass_0727.date;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		Date d1 = new Date();
		Date d2 = new Date(1000*60*60);
		System.out.println(DateUtil.dateToString(d1, "yyyy年"));
		System.out.println(DateUtil.dateToString(d1, "yyyy年MM月dd日"));
		System.out.println(DateUtil.dateToString(d2, "yyyy年MM月dd日 HH:mm:ss"));
		
		String s = "2017-12-23";
		System.out.println(DateUtil.stringToDate(s, "yyyy-MM-dd"));
	}
}
