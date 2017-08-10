package com.asiainfo.chapter1.liuhj.August09.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

    public static void main(String[] args) throws IOException {
        //      服务端接收客户端发过来的数据，并打印在控制台上
        /*
         * 建立tcp服务端思路
         * 1 创建服务器socket服务,通过Serversocket对象
         *2 服务端必须提供一个端口，否则客户端无法连接
         * 3 获取连接过来的客户端对象
         * 4  通过客户端对象获取socket流读取客户端发来的数据
         *     并打印在控制台上
         * 5  关闭资源  关客户端 关服务端
         * */
        //1 创建服务端对象
        ServerSocket ss =new ServerSocket(10002);
        //对象获取输入流
        //2 获取连接过来的客户端对象。
        Socket s =ss.accept();
        // 获取连接进来的ip地址
        String ip = s.getInetAddress().getHostAddress();

        //3 对象获取输入流，要读取客户端发来的数据
        InputStream in =s.getInputStream();
        //自定义缓冲区
        byte [] buf = new byte[1024];
            int len = in.read(buf);
        String  text = new String(buf,0,len);
        System.out.println(ip+":"+text );
        s.close();
        ss.close();







    }



}
