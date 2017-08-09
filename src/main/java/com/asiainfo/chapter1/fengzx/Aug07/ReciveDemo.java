package com.asiainfo.chapter1.fengzx.Aug07;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by fengzx on 2017/8/7.
 */
public class ReciveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);

        ds.receive(dp);

        InetAddress address = dp.getAddress();
        String ip = address.getHostAddress();

        byte[] byss = dp.getData();
        int len = dp.getLength();
        String s = new String(byss,0,len);

        System.out.println("from " + ip + " data is " + s);

        ds.close();
    }
}
