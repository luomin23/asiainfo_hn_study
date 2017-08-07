package com.asiainfo.chapter1.luomin.net.udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Luoo2
 * @create 2017-08-07 0:01
 */

public class Send implements Runnable {
    private DatagramSocket ds;

    Send(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while ((line = br.readLine()) != null) {
                if ("886".equals(line))
                    break;
                byte[] buf = line.getBytes();
                DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10005);
                ds.send(dp);
            }
        } catch (Exception e) {
            throw new RuntimeException("发送端失败！");
        }
    }

}
