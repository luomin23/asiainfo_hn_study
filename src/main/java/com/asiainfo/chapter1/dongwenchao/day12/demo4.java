package com.asiainfo.chapter1.dongwenchao.day12;

import java.io.Serializable;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.net.MalformedURLException;

/**
 * Created by 超超 on 2017/8/7 0007.
 */
public final class demo4 implements Serializable{
    public demo4(String spec) throws MalformedURLException {

    }

    public demo4(String xieyi, String host, String file) throws MalformedURLException {

    }

    public demo4(String xieyi , String host , String port , String file)throws MalformedURLException{

    }

    public String getxieyi() {
        return null;
    }

    public String getHost() {
        return null;
    }

    public String toString() {
        return null;
    }

    public int getDefP() {
        return 0;
    }

    public int getPort() {
        return 0;
    }

    public String getFile() {
        return null;
    }

    public static void main(String[]args) throws MalformedURLException {
        demo4 a=new demo4("http://zzuli.edu.cn");
        System.out.println("在URL("+a+")当中：");
        System.out.println("协议是"+a.getxieyi());
    }
}
