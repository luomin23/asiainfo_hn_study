package com.asiainfo.chapter1.sunmd1.BasicClass_0727.regex.demo_02;
/*
 * 分割功能练习
 * 1.(aa.bb.cc)-用"\\."分割
 * 2.aa    bb      cc -用" +"分割
 * 3.F：\\program files -用"\\\\"分割
 */
public class RegexDemo2 {
	
	public static void main(String[] args) {
		String s1 = "aa.bb.cc";
		for (String s : s1.split("\\.")) {
			System.out.println(s);
		}
		System.out.println("------------------------------");
		
		String s2 = "aa   bb       cc";
		for (String s : s2.split(" +")) {
			System.out.println(s);
		}
		System.out.println("------------------------------");
		String s3 = "F：\\program files";
		for (String s : s3.split("\\\\")) {
			System.out.println(s);
		}
		System.out.println("------------------------------");
	}

}
