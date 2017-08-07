package com.asiainfo.chapter1.Jiashihao.java82;

/**
 * Created by lenovo on 2017/8/2.
 */
import java.util.regex.Pattern;
public class zhengzebiaodashi {
    public static void main(String[]args){
        String str ="1234567890";
        if(Pattern.compile("[0-9]+").matcher(str).matches()){
            System.out.println("是由数字组成！");
        }else{
            System.out.println("不是由数字组成！");
        }
    }
}
