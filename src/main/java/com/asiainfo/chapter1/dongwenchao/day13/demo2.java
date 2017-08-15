package com.asiainfo.chapter1.dongwenchao.day13;

import com.asiainfo.chapter1.liuwy.August01.ProperUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by 超超 on 2017/8/8 0008.
 */
public class demo2 {
    private   static  String param1;
    private   static  String param2;

    public void run() {
        Properties prop =  new  Properties();
        InputStream in = ProperUtil. class .getResourceAsStream( "dong.properties" );
        try {
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        param1 = prop.getProperty( "姓名" );
        param2 = prop.getProperty( "性别" );
    }
    /**
     * 私有构造方法，不需要创建对象
     */
    private  demo2() {
    }
    public   static  String getParam1() {
        return  param1;
    }
    public   static  String getParam2() {
        return  param2;
    }
    public   static   void  main(String args[]){
        demo2 a=new demo2();
        a.run();
    }
}
