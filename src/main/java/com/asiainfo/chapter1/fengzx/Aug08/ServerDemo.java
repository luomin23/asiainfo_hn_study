package com.asiainfo.chapter1.fengzx.Aug08;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by fengzx on 2017/8/8.
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10010);

        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("server:"+data);

        OutputStream os = s.getOutputStream();
        os.write("数据已收到".getBytes());

        s.close();
        ss.close();
    }
}
