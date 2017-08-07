package com.asiainfo.chapter1.luomin.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Luoo2
 * @create 2017-08-06 23:54
 */

public class IPDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress i = InetAddress.getLocalHost();   //getLocalHost()返回本地主机
        //System.out.println(i.toString());
        //System.out.println("address::"+i.getHostAddress());  //获取IP地址
        //System.out.println("name::"+i.getHostName());  //获取主机名
        InetAddress ia = InetAddress.getByName("127.0.0.1");
        System.out.println("address::" + ia.getHostAddress());  //获取IP地址
        System.out.println("name::" + ia.getHostName());  //获取主机名
    }
}


