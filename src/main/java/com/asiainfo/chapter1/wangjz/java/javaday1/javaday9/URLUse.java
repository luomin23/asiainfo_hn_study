package com.asiainfo.chapter1.wangjz.java.javaday1.javaday9;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by wjz123456 on 2017/8/4.
 */
public class URLUse {
    public static void main(String[] args) {
        try {
            URL u=new URL("http://www.zzuli.edu.cn");
            System.out.println("协议"+u.getProtocol());
            System.out.println("主机名"+u.getHost());
            System.out.println("文件名"+u.getFile());
            System.out.println("端口号"+u.getPort());
            System.out.println(u);
            System.out.println(u.getQuery());
            System.out.println(u.getAuthority());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
