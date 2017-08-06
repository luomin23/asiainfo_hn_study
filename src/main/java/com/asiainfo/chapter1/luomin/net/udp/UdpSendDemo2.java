package com.asiainfo.chapter1.luomin.net.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *  记着一个规律：在程序中只要用到了java.net包，通常都会用到java.io包。
 * @author Luoo2
 * @create 2017-08-07 0:00
 */

public class UdpSendDemo2 {
    public static void main(String[] args) throws IOException {
                DatagramSocket ds = new DatagramSocket();
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String line = null;
                //readLine()方法是阻塞式方法，如果没有数据，会等
                while((line=br.readLine())!=null){
                    if ("886".equals(line))
                        break;
                    byte[] buf = line.getBytes();
                    DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10003);
                    ds.send(dp);
                }
                ds.close();
            }

}
