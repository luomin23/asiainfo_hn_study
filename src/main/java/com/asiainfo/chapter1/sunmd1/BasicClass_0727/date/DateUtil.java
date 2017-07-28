package com.asiainfo.chapter1.sunmd1.BasicClass_0727.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期，字符串相互转化的工具类
 * @author Administrator
 *
 */


public class DateUtil {

	public static String dateToString(Date d,String format){
		return new SimpleDateFormat(format).format(d);
	}
	
	public static Date stringToDate(String s,String format) throws ParseException{
		return new SimpleDateFormat(format).parse(s);
	}
	
}
