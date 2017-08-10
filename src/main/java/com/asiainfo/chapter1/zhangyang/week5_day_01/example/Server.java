package com.asiainfo.chapter1.zhangyang.week5_day_01.example;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by 11 on 2017/8/7.
 */
public class Server {
    public static void main(String[] args) {
            try {
                    //1、创建服务器  指定端口   ServerSocket(int port)
                    ServerSocket serverSocket = new ServerSocket(8888);
                    //2、接收客户端连接   阻塞式
                    Socket socket = serverSocket.accept();
                    System.out.println("一个客户端已经连接！");
                    String msg = "欢迎使用";
                    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                    dos.writeUTF(msg);
                    dos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
