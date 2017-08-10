package com.asiainfo.chapter1.dongwenchao.day13;

import com.asiainfo.chapter1.zhangle.day3.Object;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * Created by 超超 on 2017/8/8 0008.
 */
public class demo1 {
    public String porper(){
        InputStream intputStream= Object.class.getResourceAsStream("/dong.properties");
        Properties p=new Properties();
        try{
            p.load(intputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("姓名是："+p.getProperty("姓名"));
        return p.getProperty("姓名");
    }
    public static void main(String[]args){
        demo1 a=new demo1();
        a.porper();
    }
}
