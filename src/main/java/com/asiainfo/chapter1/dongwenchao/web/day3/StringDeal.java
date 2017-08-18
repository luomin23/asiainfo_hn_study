package com.asiainfo.chapter1.dongwenchao.web.day3;

/**
 * Created by 超超 on 2017/8/18 0018.
 */
public class StringDeal {
    public static String a(String str){
        String newstr=str.replace("\r\n", "<br>");
        newstr =newstr.replace(" ", "&nbsp;");
        return newstr;
    }
}
