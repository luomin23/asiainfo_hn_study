package com.asiainfo.chapter1.zhangyang.day_01.control;

public class SwitchDemo01 {
	public static void main(String args[]) {
		int grade = 80;
		switch (grade) {
		case 90:
			System.out.println("����");
			break;
		case 80:
		case 75:
			System.out.println("����");
			break;
		case 60:
			System.out.println("����");
		case 55:
			System.out.println("����Ҫ��Ŭ��Ŭ��");
			break;
		default:
			System.out.println("δ֪�ȼ�");
		}
		System.out.println("��ķ����� " + grade);
	}
}
