package com.asiainfo.chapter1.zhangyang.week5_day_01.example;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by 11 on 2017/8/7.
 */
/*
udp
 */
public class MyServer {
    public static void main(String[] args) {
        //创建服务端+端口
        try {
            DatagramSocket server = new DatagramSocket(8888);
           //准备容器
            byte [] container = new byte[2014];
            //封装成包
            DatagramPacket packet = new DatagramPacket(container,container.length);
            try {
                //接受数据
                server.receive(packet);
                //分析数据
                byte [] data = packet.getData();
                int len = packet.getLength();
                System.out.println(new String(data,0,len));
               //释放数据
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
