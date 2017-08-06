package com.asiainfo.chapter1.luomin.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 通过udp传输方式，讲一段文字数据发送出去。
 * 定义了一个udp的发送端。
 *
 * @author wl-pc
 *         思路：1.建立udpsocket服务。
 *         2.要提供数据，并将数据封装到数据包中。
 *         3.通过socket服务的发送功能，将数据包发送出去。
 *         4.关闭资源
 */
public class UdpSendDemo {
    public static void main(String[] args) throws IOException {
        //1.创建udp服务，通过DatagramScoket对象。
        DatagramSocket ds = new DatagramSocket(8888);
        //2.确定数据，并且封装成数据包
        byte[] buf = "itheima,hello!".getBytes();
        DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10000);
        //3.通过socket服务，将已有的数据包发送出去，通过send()方法
        ds.send(dp);
        //关闭资源
        ds.close();
    }
}
