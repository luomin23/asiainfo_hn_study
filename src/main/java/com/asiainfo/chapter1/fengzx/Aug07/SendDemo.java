package com.asiainfo.chapter1.fengzx.Aug07;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by fengzx on 2017/8/7.
 */
public class SendDemo {
    public static void main(String[] args) throws IOException{
        DatagramSocket ds = new DatagramSocket();

        byte[] bys = "hello,udp,I am coming".getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("192.168.199.160");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bys,length,address,port);

        ds.send(dp);

        ds.close();
    }
}
