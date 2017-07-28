package com.asiainfo.chapter1.zhangyang.Array;
import java.util.Arrays;

public class ArrayDemo03 {
	public static void main(String[] args) {
		String [] str = {"a","b","c","d"};
		//ʹ��Arrays�еķ����ж��������Ƿ����ĳ��Ԫ��
		boolean boo = Arrays.asList(str).contains("b");
		System.out.println(boo);
	}
}
