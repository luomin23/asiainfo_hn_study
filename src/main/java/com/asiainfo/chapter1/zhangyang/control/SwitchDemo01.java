package com.asiainfo.control;

public class SwitchDemo01 {
	public static void main(String args[]) {
		int grade = 80;
		switch (grade) {
		case 90:
			System.out.println("优秀");
			break;
		case 80:
		case 75:
			System.out.println("良好");
			break;
		case 60:
			System.out.println("及格");
		case 55:
			System.out.println("你需要再努力努力");
			break;
		default:
			System.out.println("未知等级");
		}
		System.out.println("你的分数是 " + grade);
	}
}
