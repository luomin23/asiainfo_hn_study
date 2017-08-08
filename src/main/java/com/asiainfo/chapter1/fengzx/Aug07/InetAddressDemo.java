package com.asiainfo.chapter1.fengzx.Aug07;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by fengzx on 2017/8/7.
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.199.160");
        String name = address.getHostName();
        String ip = address.getHostAddress();
        System.out.println(name + "-----" + ip);
    }
}
