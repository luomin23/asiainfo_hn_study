package com.asiainfo.chapter1.luomin.net.demo3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Luoo2
 * @create 2017-08-14 0:19
 */

public class SocketService {
    public static final String BACK_ADDRESS_LIST_PATH ="C:\\idea_workspace\\asiainfo_hn_study\\src\\main\\resources\\com\\asiainfo\\chapter1\\luomin\\net\\demo3\\backaddresslist.txt";


    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(4007);
        Socket s = ss.accept();
        InputStream in = s.getInputStream();
        FileOutputStream fos = new FileOutputStream(BACK_ADDRESS_LIST_PATH);
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = in.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }

        OutputStream out = s.getOutputStream();
        out.write("上传成功！".getBytes());
        fos.close();
        s.close();
        ss.close();
    }
}
