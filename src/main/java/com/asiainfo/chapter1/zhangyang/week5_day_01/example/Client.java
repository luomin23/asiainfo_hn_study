package com.asiainfo.chapter1.zhangyang.week5_day_01.example;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by 11 on 2017/8/7.
 */
public class Client {
    public static void main(String[] args) {
        try {
            //1、创建客户端   必须指定服务器+端口    此时就在连接
            Socket client = new Socket("localhost",8888);
            //2、接收数据
            DataInputStream dis = new DataInputStream(client.getInputStream());
            String str = dis.readUTF();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
