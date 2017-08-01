package com.asiainfo.chapter1.xushuo.x0731_0801.zfc;

/**
 * Created by root on 2017/7/31.
 */
public class ZfcString {
    public static void main(String[] args) {
        String s1 = "qqq";
        String s2 = "aaa";
        String s4 = "qqq";

        //定义字符串s3，保存“Belive”和s1拼接后的内容
        String s3 = new String("qqq");

        // 比较字符串s1和s2
        // imooc为常量字符串，多次出现时会被编译器优化，只创建一个对象
        System.out.println("s1和s2内存地址相同吗？" + (s1 == s2));

        //比较字符串s1和s3
        System.out.println("s1和s3内存地址相同吗？" +( s1 == s3));
        //比较字符串s1和s4
        System.out.println("s1和s3内存地址相同吗？" +(s1 == s4));

        String s5 = "Belive " + s1;
        //比较字符串s5和s3
        // s1是变量，s5在运行时才知道具体值，所以s3和s5是不同的对象
        System.out.println("s3和s4内存地址相同吗？" + (s5 == s3));
    }
}
