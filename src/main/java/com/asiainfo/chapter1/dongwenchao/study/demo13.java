package com.asiainfo.chapter1.dongwenchao.study;

/**
 * Created by 超超 on 2017/8/14 0014.
 */
public class demo13 {
    public static void link(StringBuilder a){
        a.append("WORLD");
    }

    public static void main(String[] args) {
        StringBuilder a=new StringBuilder("HELLO");
        link(a);
        System.out.println(a);
    }
}
