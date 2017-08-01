package com.asiainfo.chapter1.liuwy.August01;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by LENOVO on 2017/8/1.
 */
public class ProperUtil {
    private ProperUtil(){}
    private static Properties properties=new Properties();
    static {
        try {
            properties.load(ProperUtil.class.getResourceAsStream("my.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}
