package com.asiainfo.chapter1.zhangyang.recursion;
//ʹ�õݹ��㷨��ӡ�žų˷���
public class TestDemo02 {
	public static void main(String[] args) {
		method1(9);
	}

	public static void method1(int i) {
		if (i == 1) {
			System.out.print("1*1=1\t\n");
		} else {
			method1(i - 1);
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
	}
}
