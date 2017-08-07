package com.asiainfo.chapter1.luomin.net.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Luoo2
 * @create 2017-08-07 0:10
 */

public class TextServer {
    public static void main(String[] args) throws IOException {
                 ServerSocket ss = new ServerSocket(4006);
                 Socket s = ss.accept();
                 String ip = s.getInetAddress().getHostAddress();
                 System.out.println(ip+".....conneted");
                 BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
                 PrintWriter out = new PrintWriter(new FileWriter("F:\\Javajichu\\JavaLianXi\\src\\cn\\itheima\\day06\\server.txt"),true);
                 String line = null;
                 while((line=bufIn.readLine())!=null){
                     out.println(line);
                 }
                 s.shutdownOutput();  //关闭客户端的输出流，相当于给流中加一个结束标记  ：-1
                 PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
                 pw.println("上传成功！");
                 out.close();
                 s.close();
                 ss.close();
            }

}
