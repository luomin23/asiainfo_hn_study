package com.asiainfo.chapter1.luhui.luhui12;

/**
 * Created by 18237161432 on 2017/8/9.
 */
public class text123 {
    public static void main(String[] args) {
        String line1="陆辉辉辉辉辉";
       // String f = line1;
        int start = 2;
        int end = 6;
        char h[] = new char[end - start];
        line1.getChars(start, end, h, 0);
        System.out.println(h);
    }
}