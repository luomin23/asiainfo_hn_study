package com.asiainfo.chapter1.luomin.net.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端：
 * 源：socket读取流
 * 目的：socket输出流
 * 都是文本数据并且需要装饰
 */
public class TransServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(4002);
        Socket s = ss.accept();
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip + "....conneted");
        //读取socket读取流中的数据
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //socket输出流中，并且要转换成大写字母再写入到socket输出流，并发送给客户端
        BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line = null;
        while ((line = bufIn.readLine()) != null) {  //readLine()阻塞式方法
            bufOut.write(line.toUpperCase());
            bufOut.newLine();  //跨平台换行
            bufOut.flush();  //刷新数据
        }
        s.close();
        ss.close();
    }

}
