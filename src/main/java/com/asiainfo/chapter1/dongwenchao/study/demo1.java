package com.asiainfo.chapter1.dongwenchao.study;

/**
 * Created by 超超 on 2017/8/1 0001.
 */
public class demo1 {
    public static void main(String []args){
        String a="hello,world";
       /* String b="HELLO,WORLD";
        Object obja=a;
        //返回字符串中第一个字母ASCII的差值。
        System.out.println(a.compareTo(b));
        System.out.println(a.compareToIgnoreCase(b));
        System.out.println(a.compareTo(obja.toString()));*/
        /*int b=a.lastIndexOf("rl");
        if (b==-1){
            System.out.println("没有找到字符串");
        }else
            System.out.println("第"+b+"个位置是这个");*/
        System.out.println(delete(a,5));
    }
    private static String delete(String a1, int i1) {
        return a1.substring(0,i1)+a1.substring(i1+1);
    }

}
