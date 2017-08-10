package com.asiainfo.chapter1.zhangle.August8th;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by del on 2017/8/8.
 */
public class Sever {
    private int port=7600;
    private ServerSocket serverSocket;
    public Sever() throws IOException {
        // 3=backlog 参数用来显式设置连接请求队列的长度,
        serverSocket =new ServerSocket(port,3);
        System.out.println("服务器启动");
    }
    public void service(){
        while (true){
            Socket socket=null;
            try {
                socket=serverSocket.accept();
                System.out.println("New connection accepted"+socket.getInetAddress()+":"+socket.getPort());
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                if(socket==null){
                    try {
                        socket.close();
                    } catch (IOException e) {
                        System.out.println("关闭异常");
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Sever server = new Sever();
        Thread.sleep(600*10);
        server.service();

    }
}
