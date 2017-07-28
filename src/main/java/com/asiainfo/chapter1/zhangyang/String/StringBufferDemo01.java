package com.asiainfo.String;

public class StringBufferDemo01 {
	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer("我的姓名：");
		sBuffer.append("张扬");
		sBuffer.append("，年龄");
		sBuffer.append("21");
		System.out.println(sBuffer);
	}
}
