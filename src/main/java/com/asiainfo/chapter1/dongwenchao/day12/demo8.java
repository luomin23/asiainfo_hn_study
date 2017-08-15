package com.asiainfo.chapter1.dongwenchao.day12;
import java.net.*;
import java.io.IOException;

/**
 * Created by 超超 on 2017/8/7 0007.
 */
public class demo8 {
    public static void main(String[] args) {
        /*try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("本机IP地址："+address);//WIN-01605241431/192.168.17.1
            System.out.println("主机名是："+address.getHostName());//WIN-01605241431
            System.out.println("完全限定名字是："+address.getCanonicalHostName());//WIN-01605241431
            InetAddress address2 = InetAddress.getByName("222.34.5.7");
            System.out.println("返回远程IP地址："+address2);
            InetAddress address3 = InetAddress.getByName("www.google.com");
            System.out.println("返回域名IP地址："+address3);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }*/
        String host = "localhost";
        if (args.length > 0) {
            host = args[0];
        }
        new demo8().scan(host);
        /*demo8 a=new demo8();
        a.scan("WIN-01605241431");同上面的效果*/
    }
    /*public void scan(String host) {
        Socket socket = null;

        for (int port = 134; port < 1024; port++) {
            try {
                socket = new Socket(host, port);
                System.out.println("连接到端口：" + port);
            } catch (IOException e) {
                System.out.println("无法连接到端口：" + port);
            } finally {
                try {
                    if (socket != null) {
                        socket.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        }*/
    public void scan(String host) {
        Socket socket = null;
        socket = new Socket();
        SocketAddress address = new InetSocketAddress(host,135);
        try {
            socket.connect(address, 60000);
            System.out.println("连接成功！");
        } catch (IOException e) {
            System.out.println("连接超时！");
            e.printStackTrace();
        }
    }
}
