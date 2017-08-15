package com.asiainfo.chapter1.dongwenchao.day12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * Created by 超超 on 2017/8/7 0007.
 */
public class demo7 extends Thread{
    private ServerSocket serverSocket;
    public demo7(int post)throws IOException{
        serverSocket =new ServerSocket();
        serverSocket.setSoTimeout(10000);
    }
    public void run(){
        while (true){
            try{
                System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                System.out.println("远程主机地址：" + server.getRemoteSocketAddress());
                DataInputStream in=new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");
                server.close();
            } catch (SocketTimeoutException e) {
                System.out.println("Socket timed out!");
                break;
            }catch (IOException  e1){
                e1.printStackTrace();
                break;
            }
        }
    }
    public static void main(String[]args){
        int port=Integer.parseInt(args[135]);
        Thread t = null;
        try {
            t = new demo7(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        t.run();
    }
}
