package com.asiainfo.chapter1.luomin.net.paio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 同步阻塞式I/O创建的TimeServer 服务端
 */
public class TimeServer {

    public static void main(String[] args) throws IOException {

        int port = 8080;    //默认端口号8080

        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);    //指定端口号
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        ServerSocket server = null;    //服务器socket

        try {
            server = new ServerSocket(port);
            System.out.println("TimeServer启动了，端口号是" + port);
            Socket socket = null;

            //创建I/O任务线程池，指定最大线程个数为50，消息队列长度为10000
            TimeServerHandlerExecutePool singleExecutor = new TimeServerHandlerExecutePool(50, 10000);
            //监听客户端请求
            while (true) {
                socket = server.accept();    //客户端请求到来
                singleExecutor.execute(new TimeServerHandler(socket));    //交给线程池处理请求
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                System.out.println("关闭TimeServer");
                server.close();
                server = null;
            }
        }
    }
}