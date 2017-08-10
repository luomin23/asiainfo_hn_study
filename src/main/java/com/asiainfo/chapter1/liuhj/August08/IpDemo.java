package com.asiainfo.chapter1.liuhj.August08;

import java.net.InetAddress;



public class IpDemo {
    public static void main(String[] args) throws Exception {

        InetAddress ip = InetAddress.getLocalHost();

        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());


    }


}


