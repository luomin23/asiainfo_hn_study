package com.asiainfo.chapter1.sunmd1.BasicClass_0727.system.demo_02;

import java.util.Arrays;
/*
 * public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 *	从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
 */

public class SystemDemo {
	public static void main(String[] args) {
		int[] arr1 = {1,34,2,3,29};
		int[] arr2 = {8,3,54,11,34};
		System.arraycopy(arr1, 3, arr2, 1, 2);
		System.out.println(Arrays.toString(arr2));
	}

}
