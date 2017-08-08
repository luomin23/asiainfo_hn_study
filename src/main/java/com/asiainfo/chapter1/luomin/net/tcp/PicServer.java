package com.asiainfo.chapter1.luomin.net.tcp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Luoo2
 * @create 2017-08-07 0:11
 */

public class PicServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(4007);
        Socket s = ss.accept();
        InputStream in = s.getInputStream();
        FileOutputStream fos = new FileOutputStream("C:\\idea_workspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\luomin\\net\\tcp\\server.jpg");
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
