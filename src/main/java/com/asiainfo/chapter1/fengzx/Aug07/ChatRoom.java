package com.asiainfo.chapter1.fengzx.Aug07;

import java.io.IOException;
import java.net.DatagramSocket;

/**
 * Created by fengzx on 2017/8/7.
 */
public class ChatRoom {
    public static void main(String[] args) throws IOException {
        DatagramSocket dsSend = new DatagramSocket();
        DatagramSocket dsReceive = new DatagramSocket(12580);

        SendThread st = new SendThread(dsSend);
        ReceiveThread rt = new ReceiveThread(dsReceive);

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(rt);

        t1.start();
        t2.start();
    }
}
