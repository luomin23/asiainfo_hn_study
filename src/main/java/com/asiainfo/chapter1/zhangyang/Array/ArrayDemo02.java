package com.asiainfo.chapter1.zhangyang.Array;

import java.util.Arrays;

public class ArrayDemo02 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		String arrString = Arrays.toString(nums);
		// ʹ��Array��toString������ӡ������������
		//toString������Ҫ�ǽ�����ת��Ϊ�ַ����������
		System.out.println(arrString);
		//ʹ��forѭ����������Ԫ��
		for(int i=0;i<nums.length;i++){
			System.out.print(i+"\n");
		}
		//��ǿ��forѭ����������
		int [] num = {11,22,33};
		for(int i:num){
			System.out.println(i);
		}
	}
}
