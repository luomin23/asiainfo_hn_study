package com.asiainfo.chapter1.zhangyang.week5_day_01.demo02;

import java.io.*;
import java.net.Socket;

/**
 * Created by 11 on 2017/8/7.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 9999);
        new Thread(new Send(client)).start();//一条路径
        new Thread(new Receive(client)).start();
    }
}
