package com.asiainfo.chapter1.dongwenchao.day12;

import java.io.*;
import java.net.Socket;

/**
 * Created by 超超 on 2017/8/8 0008.
 */
//客户端
public class demo17 {
    public static void main(String[] args) throws IOException {
        // 创建客户端Socket对象
        Socket s = new Socket("192.168.17.1", 23456);
        // 封装文本文件
        BufferedReader br = new BufferedReader(new FileReader("asd"));
        // 封装通道内数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                s.getOutputStream()));
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        // 释放资源
        br.close();
        s.close();
    }
}
