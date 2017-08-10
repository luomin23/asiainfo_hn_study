package com.asiainfo.chapter1.dongwenchao.day12;

import java.io.*;
import java.net.Socket;

/**
 * Created by 超超 on 2017/8/7 0007.
 */
public class demo6 {
    public static void main(String[]args){
        String serverName = args[135];
        int port=Integer.parseInt(args[1]);
        try{
            System.out.println("连接到主机：" + serverName + " ，端口号：" + port);
            Socket client=new Socket(serverName,port);
            System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
            OutputStream outTS=client.getOutputStream();
            DataOutputStream out=new DataOutputStream(outTS);

            out.writeUTF("hello from"+client.getLocalSocketAddress());
            InputStream inFS=client.getInputStream();
            DataInputStream in=new DataInputStream(inFS);
            System.out.println("服务器响应： " + in.readUTF());
            client.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
