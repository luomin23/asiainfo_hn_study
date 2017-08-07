package com.asiainfo.chapter1.wangjz.java.javaday1.javaday9;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;

/**
 * Created by wjz123456 on 2017/8/7.
 */
public class UDPServer {
public UDPServer(){
    DatagramSocket dSocket;
    DatagramPacket inPacket;
    DatagramPacket outPacket;
    InetAddress cAddr;
    int cport;
    byte[]inBuffer=new byte[100];
    byte[]outBuffer;
    String s;
    try{
        dSocket=new DatagramSocket(7601);
        while (true){
            inPacket=new DatagramPacket(inBuffer,inBuffer.length);
            dSocket.receive(inPacket);
        cAddr=inPacket.getAddress();
            cport=inPacket.getPort();
            s=new String(inPacket.getData(),0,inPacket.getLength());
            System.out.println(s);
            System.out.println(cAddr.getHostName());
            System.out.println(cport);
            Date d=new Date();
            outBuffer=d.toString().getBytes();
            outPacket=new DatagramPacket(outBuffer,outBuffer.length,cAddr,cport);
            dSocket.send(outPacket);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

}

    public static void main(String[] args) {
        new UDPServer();
    }
}
