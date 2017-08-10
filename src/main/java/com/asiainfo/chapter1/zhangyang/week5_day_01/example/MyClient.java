package com.asiainfo.chapter1.zhangyang.week5_day_01.example;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * Created by 11 on 2017/8/7.
 */
public class MyClient {
    public static void main(String[] args) {
        try {
            DatagramSocket client = new DatagramSocket(6666);
            String str = "我是客户端";
            byte[] data = str.getBytes();
            DatagramPacket packet = new DatagramPacket(data,data.length,new InetSocketAddress("localhost",8888));
            try {
                client.send(packet);
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
