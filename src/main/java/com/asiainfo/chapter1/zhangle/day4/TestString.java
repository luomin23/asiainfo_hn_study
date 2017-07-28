package com.asiainfo.chapter1.zhangle.day4;

/**
 * Created by del on 2017/7/27.
 * 输出格式化数字可以使用 printf() 和 format() 方法。
 * String 类使用静态方法 format() 返回一个String 对象而不是 PrintStream 对象。
 */
public class TestString {

    public static void strign(){
        float f=2.3F;
        double d=1.2;
        int i=10;
        String s="jsd";
        System.out.printf("(1)浮点型变量的的值为 " +
                "%f, 整型变量的值为 " + " %d, 字符串变量的值为 " +
                "is %s", f, i, s);
        //也可以这样写
        String fs;
        fs = String.format("(2)浮点型变量的的值为 " +
                "%f, 整型变量的值为 " + " %d, 字符串变量的值为 " +
                " %s", f, i, s);
        System.out.printf(fs);
    }
    public static void main(String args[]){
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println( helloString );
        System.out.println("String.format格式化字符串");
        strign();

    }
}
