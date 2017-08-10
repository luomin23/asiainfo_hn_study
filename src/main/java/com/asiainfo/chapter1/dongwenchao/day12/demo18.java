package com.asiainfo.chapter1.dongwenchao.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * Created by 超超 on 2017/8/8 0008.
 */
//服务端
public class demo18 {
    public static void main(String[] args) throws IOException {
        // 创建服务器端Socket对象
        ServerSocket ss = new ServerSocket(23456);
        // 监听客户端数据
        Socket s = ss.accept();
        // 封装通道内数据
        BufferedReader br = new BufferedReader(new InputStreamReader(
                s.getInputStream()));
        String line ;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        // 释放资源
        s.close();
    }
}
