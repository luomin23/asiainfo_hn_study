package com.asiainfo.chapter1.luomin.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  演示tcp的传输的客户端和服务器端的互访。
 * @author Luoo2
 * @create 2017-08-07 0:06
 */

public class TcpServer2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10007);
        Socket s = ss.accept();
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip + "......conneted");
        InputStream in = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf, 0, len));
        OutputStream out = s.getOutputStream();
        out.write("收到数据,你也好！".getBytes());
        s.close();
        ss.close();
    }

}
