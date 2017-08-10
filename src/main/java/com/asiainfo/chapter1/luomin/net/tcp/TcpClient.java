package com.asiainfo.chapter1.luomin.net.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
  * 演示TCP传输：
  * 1.tcp分为客户端和服务器端
  * 2.客服端对应的对象是socket
  *   服务器端对应的对象是serverSocket
  */
/**
  * 客户端：通过查阅socket对象，发现在该
  * 对象建立时，就可以连接指定的主机。
  * 因为tcp是面向连接的。所以在建立socket服务
  * 时，就要有服务端存在，并且连接成功，形成
  * 通路后，再在该通道进行数据的传输。
  * 步骤：
  *    1）创建socket服务，并指定要连接的主机和端口
  *    2）为了发送数据，应该获取socket流中的输出流
  *    3）往输入流中写数据
  *    4）关闭资源
  */
  /**
  * 需求：给服务端发送一个文本数据
  */

public class TcpClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
                //1.创建客户端的socket服务，指定目的主机以及端口
                Socket s = new Socket("127.0.0.1",10006);
                //2.为了发送数据，应该获取socket流中的输出流
                OutputStream out = s.getOutputStream();
                //3.往流中写数据
                out.write("itheima,hello!".getBytes());
                //4.关闭资源
                s.close();
            }

}
