package com.asiainfo.chapter1.dongwenchao.day08;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 超超 on 2017/8/2 0002.
 */
public class demo2 {
    public demo2(InputStream in){
        try{
            while(true){
                int i=in.read();
                char c=(char)i;
                System.out.print(c);
            }
        }catch(IOException e){
            System.out.print(e);
            e.printStackTrace();
        }
    }
    public static void main(String []args){
        new demo2(System.in);//System.in是InputStream类的常量，通过read()方法获取从键盘输入发热
    }
}
