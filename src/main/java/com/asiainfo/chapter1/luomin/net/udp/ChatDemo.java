package com.asiainfo.chapter1.luomin.net.udp;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author Luoo2
 * @create 2017-08-07 0:03
 */

public class ChatDemo {
    public static void main(String[] args) throws SocketException {

        DatagramSocket sendSocket = new DatagramSocket();
        DatagramSocket receSocket = new DatagramSocket(10005);
        new Thread(new Send(sendSocket)).start();
        new Thread(new Rece(receSocket)).start();
    }

}
