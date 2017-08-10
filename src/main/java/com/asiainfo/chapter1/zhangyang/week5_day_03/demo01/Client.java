package com.asiainfo.chapter1.zhangyang.week5_day_03.demo01;

import java.io.*;
import java.net.Socket;
/**
 * Created by 11 on 2017/8/9.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端已经启动。。。。");
        //选择传入文件的路径
        File file = new File("G:\\Javaio\\10\\java001.txt");
        System.out.println("文件存在："+file.exists());
        //向服务器建立连接
        Socket socket = new Socket("localhost",8888);
        //printwriter更容易操作文本
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        //获取文本文件的输入流
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        //把文本文件读入缓冲区，然后写到服务器端
        while((line = br.readLine()) != null){
            out.println(line);
        }
        //输出流结束标记
        socket.shutdownOutput();
        //接收服务器端返回的信息
        BufferedReader in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(in.readLine());
        //关闭资源
        socket.close();
        ReadTxt read = new ReadTxt();
        read.readTxtFile();
    }
}
