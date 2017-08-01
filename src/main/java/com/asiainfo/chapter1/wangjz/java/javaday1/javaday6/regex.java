package com.asiainfo.chapter1.wangjz.java.javaday1.javaday6;
import java.util.regex.*;
/**
 * Created by wjz123456 on 2017/7/31.
 */
public class regex {
    public static void main(String args[]){
        String s1 = "I am noob " +
                "from runoob.com.";

        String s2 = ".*runoob.*";
         String in="noob";
        Pattern pattern=Pattern.compile(in);
        Matcher matcher=pattern.matcher(s1);
        if(matcher.find()){
            System.out.println(matcher.start());
            System.out.println(matcher.end());

        }
        boolean isMatch = Pattern.matches(s1, s2);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
    }

}
