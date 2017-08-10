package com.asiainfo.chapter1.luomin.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author Luoo2
 * @create 2017-08-07 0:01
 */

public class UdpReceDemo2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10003);
        while (true) {
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, buf.length);
            ds.receive(dp);  //receive()方法是阻塞式方法，如果没有数据，会等
            String ip = dp.getAddress().getHostAddress();
            String data = new String(dp.getData(), 0, dp.getLength());
            int port = dp.getPort();
            System.out.println(ip + "::" + data + "::" + port);
        }
    }

}
