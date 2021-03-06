package com.asiainfo.chapter1.zhangyang.week5_day_01.demo02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by 11 on 2017/8/7.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);

        Socket client = server.accept();
        DataInputStream dis = new DataInputStream(client.getInputStream());
        //输出流
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        while (true) {
            String str = dis.readUTF();
            dos.writeUTF("服务器：" + str);
            dos.flush();
        }
        }
    }

