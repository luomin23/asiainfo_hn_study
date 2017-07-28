package com.asiainfo.chapter1.wangjz.java.javaday1.javaday3;

/**
 * Created by wjz123456 on 2017/7/26.
 */
public class static_test {
    public static String toChar(double x){
        return Double.toString(x);
    }
    public static void main(String[] args) {
        System.out.println(Math.round(2.56));
        String s=toChar(5.678);
        System.out.println("e="+s);
    }
}
