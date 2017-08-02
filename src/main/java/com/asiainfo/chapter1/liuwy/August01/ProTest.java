package com.asiainfo.chapter1.liuwy.August01;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by LENOVO on 2017/8/1.
 */
public class ProTest {
    public static void main(String[] args){
//    Properties properties=new Properties();
//        try {
//            properties.load(ProTest.class.getResourceAsStream("my.properties"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String username=properties.getProperty("username");
        String username=ProperUtil.getProperty("username");
        System.out.println(username);
    }
}
