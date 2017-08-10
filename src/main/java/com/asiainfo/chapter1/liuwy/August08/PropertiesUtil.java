package com.asiainfo.chapter1.liuwy.August08;

import com.asiainfo.chapter1.liuwy.August01.ProperUtil;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by LENOVO on 2017/8/9.
 */
public class PropertiesUtil {
    private PropertiesUtil(){}
    private static Properties properties=new Properties();
    static {
        try {
            properties.load(PropertiesUtil.class.getResourceAsStream("person.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}

