package com.asiainfo.chapter1.sunmd1.BasicClass_0727.regex.demo_01;

import java.util.Scanner;


/**
 * 正则表达式：符合一定规则的表达式
 * 问题：校验qq
 * 分析：1.长度5-15数字
 * 		2.0不能开头
 * 实现步骤：
 * 1.输入qq
 * 2.功能实现：2个明确（返回类型（boolean）/参数列表（QQ号））
 * 3.调用功能，得到结果
 * @author Administrator
 *
 */
public class RegexDemo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入QQ号：");
		String qq = scanner.nextLine();
		System.out.println("checkQQ"+checkQQ(qq));
		
	}
	
	
	public static boolean checkQQ(String qq){

		//使用正则表达式\d[0,9]
		return qq.matches("[1,9]\\d{4,14}");
		
		//普通方式实现（if嵌套）,思考java封装的思想
		/*boolean flag = true;
		//长度判断
		if(qq.length()>=5 && qq.length()<=15){
			//0不能开头
			if(!qq.startsWith("0")){
				//都是数字，String-char-‘0’-‘9’
				char[] chs = qq.toCharArray();
				for (char c : chs) {
					if(!(c>='0' && c<='9')){
						flag = false;
					}
				}
				
			}else{
				flag = false;
			}
		}else{
			flag = false;
		}
		
		return flag;*/
		
	}

}
