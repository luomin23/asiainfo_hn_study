package com.asiainfo.chapter1.luomin.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author Luoo2
 * @create 2017-08-07 0:02
 */

public class Rece implements Runnable {
    private DatagramSocket ds;

    Rece(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            while (true) {
                byte[] buf = new byte[1024];
                DatagramPacket dp = new DatagramPacket(buf, buf.length);
                ds.receive(dp);
                String ip = dp.getAddress().getHostAddress();
                String data = new String(dp.getData(), 0, dp.getLength());
                int port = dp.getPort();
                System.out.println(ip + "::" + data + "::" + port);
            }
        } catch (Exception e) {
            throw new RuntimeException("接收端失败！");
        }
    }
}

