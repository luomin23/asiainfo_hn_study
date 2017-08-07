package com.asiainfo.chapter1.luomin.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端需求：定义端点接收数据，并且打印到控制台上。
 *  步骤：
 *      1）建立服务端的socket的服务，通过ServerSocket()来建立，
 *         并监听一个端口。
 *      2）获取连接过来的客户端对象，通过ServerSocket的accept()
 *         方法来完成。所以这个方法是阻塞式的，没有连接，就会等。
 *      3）客户端如果发过来数据，那么服务端要使用对应的客户端对象
 *         并获取到该客户端对象的读取流来读取的发过来的数据。并打印
 *         在控制台上。
 *      4）（可选操作）关闭服务端。
 */

public class TcpServer {
    public static void main(String[] args) throws IOException {
        //1.建立服务端的socket服务，并监听一个端口
        ServerSocket ss = new ServerSocket(10006);
        //2.通过accept()方法获取连接过来的客户端对象。
        Socket s = ss.accept();
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip + "::连接成功！");
        //3.获取客户端发送过来的数据，那么要使用客户
        //端对象的读取流来读取数据
        InputStream in = s.getInputStream();   //源是网络流
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf, 0, len));
        s.close();
        ss.close();
    }

}
