package com.asiainfo.chapter1.zhangyang.String;

public class StringBufferDemo01 {
	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer("�ҵ�������");
		sBuffer.append("����");
		sBuffer.append("������");
		sBuffer.append("21");
		System.out.println(sBuffer);
	}
}
