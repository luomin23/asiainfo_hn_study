package com.asiainfo.chapter1.zhangyang.week5_day_01.demo01;

import java.io.*;
import java.net.Socket;

/**
 * Created by 11 on 2017/8/7.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //控制台输入流
        Socket client = new Socket("localhost",9999);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        //输出流
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        //输入流
        DataInputStream dis = new DataInputStream(client.getInputStream());
        while (true) {
            String info = console.readLine();
            dos.writeUTF(info);
            dos.flush();
            String str = dis.readUTF();
            System.out.println(str);
        }
    }
}
