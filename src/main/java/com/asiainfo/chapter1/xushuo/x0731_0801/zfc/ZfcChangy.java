package com.asiainfo.chapter1.xushuo.x0731_0801.zfc;

import java.util.Arrays;

/**
 * Created by root on 2017/7/31.
 * JAVA中String类的常用方法
 */
public class ZfcChangy {
    public static void main(String[] args) {
        //定义一个字符串“学习JAVA编程”
        String str="学习 JAVA 编程";
        //打出字符串长度
        System.out.println("字符串长度:" + str.length());
        //查找字符“编”的位置
        char c ='编';
        System.out.println("字符'编'的位置：" + str.indexOf(c));
        //查找字符串“JAVA”的位置
        System.out.println("字符串'JAVA'的位置：" + str.indexOf("JAVA"));
        //查询字符串“SQL”的位置，如果找不到返回-1
        System.out.println("字符串'SQL'的位置：" + str.indexOf("SQL"));
        //按空格把字符串拆分成一个数组，并输出数组元素
        String[] arr = str.split(" ");
        System.out.println("按空格拆分成数组：" + Arrays.toString(arr));
        System.out.println();
        //获取索引位置(3,6)之间的子串
        System.out.println("获取索引位置(2,7)之间的子串：" + str.substring(2,7));
    }
}
