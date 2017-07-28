package com.asiainfo.chapter1.sunmd1.BasicClass_0727.regex.demo_03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取功能：
 * 获取下面这个字符串中由三个字符组成的单词
 * da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
 */

public class RegexDemo {

	public static void main(String[] args) {
		String str = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
		Pattern p = Pattern.compile("\\b\\w{3}\\b");
		Matcher m = p.matcher(str);
		while(m.find()){
			System.out.println(m.group());
		}
	}
}
