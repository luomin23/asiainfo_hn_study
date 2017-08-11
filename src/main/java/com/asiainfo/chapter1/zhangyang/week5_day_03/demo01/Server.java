package com.asiainfo.chapter1.zhangyang.week5_day_03.demo01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by 11 on 2017/8/9.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器端启动.......");
        //开启服务器端的端口
        ServerSocket ss = new ServerSocket(8888);
        //接收一个客户端的请求，阻塞式的方法
        Socket s = ss.accept();
        //获取客户端的输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //获取输出文件的输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("G:\\Javaio\\10\\java002.txt")));
        //获取客户端的输出流，用于把信息返回客户端， true表示自动刷新缓冲区的数据
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        String line = null;
        //循环写出到客户端
        while((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //返回信息到客户端那边
        out.println("上传成功");
        //关闭资源
        bw.close();
        s.close();
        ss.close();
    }
}
