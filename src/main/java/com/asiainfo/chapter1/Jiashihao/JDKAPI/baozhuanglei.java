package com.asiainfo.chapter1.Jiashihao.JDKAPI;



/**
 * Created by lenovo on 2017/7/31.
 */
public class baozhuanglei {
    public static void main(String[] args){
        String str1 = "30";
        //由数字组成的字符串
        String str2 = "30.3";
        //由数字组成的字符串
        int x = Integer.parseInt(str1);
        //将字符串变为int型
        float f = Float.parseFloat(str2);
        System.out.println("整数乘方：" + x +"*" + x + "=" + (x*x));
        System.out.println("小数乘方：" + f +"*" + f + "=" + (f*f));
    }
}
