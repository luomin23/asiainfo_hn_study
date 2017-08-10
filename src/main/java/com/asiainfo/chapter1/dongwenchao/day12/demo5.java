package com.asiainfo.chapter1.dongwenchao.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by 超超 on 2017/8/7 0007.
 */
public class demo5 {
    public demo5(){
        try{
            URL url=new URL("http://www.zzuli.edu.cn");
            BufferedReader b=new BufferedReader(new InputStreamReader(url.openStream()));
            String s;
            while ((s=b.readLine())!=null)
                System.out.println(s);
            b.close();
        }catch (Exception e){
            System.err.println(e);
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        new demo5();
    }
}
