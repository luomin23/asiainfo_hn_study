package com.asiainfo.chapter1.wangjz.java.javaday1.javaday9;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by wjz123456 on 2017/8/7.
 */
public class UDPClient {
    public static void main(String[] args) {
        DatagramPacket inPacket;
        InetAddress sAddr;
        byte[]inBuffer=new byte[100];
        try{
            DatagramSocket dSocket=new DatagramSocket();
            if (args.length==0)
                sAddr=InetAddress.getByName("127.0.0.1");
            else
                sAddr=InetAddress.getByName(args[0]);
            String s="请求链接";
            byte[]outBuffer=s.getBytes();
            DatagramPacket outPacket=new DatagramPacket(outBuffer,outBuffer.length,sAddr,7601);
            dSocket.send(outPacket);
            inPacket=new DatagramPacket(inBuffer,inBuffer.length);
            dSocket.receive(inPacket);
            s=new String(inPacket.getData(),0,inPacket.getLength());
            System.out.println("接收到服务器的信息"+s);
            dSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
