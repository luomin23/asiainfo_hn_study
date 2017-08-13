package com.asiainfo.chapter1.luomin.net.demo3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Luoo2
 * @create 2017-08-14 0:09
 */

public class SocketClient {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 4007);
        FileInputStream fis = new FileInputStream("C:\\idea_workspace\\asiainfo_hn_study\\src\\main\\resources\\com\\asiainfo\\chapter1\\luomin\\net\\demo3\\addresslist.txt");
        OutputStream out = s.getOutputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf)) != -1) {
            out.write(buf, 0, len);
        }
        s.shutdownOutput(); //告诉客户端数据已经写完
        InputStream in = s.getInputStream();
        byte[] bufIn = new byte[1024];
        int num = in.read(bufIn);
        System.out.println(new String(bufIn, 0, num));
        fis.close();
        s.close();
    }
}
