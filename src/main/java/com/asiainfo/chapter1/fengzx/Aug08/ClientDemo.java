package com.asiainfo.chapter1.fengzx.Aug08;

import java.io.*;
import java.net.Socket;

/**
 * Created by fengzx on 2017/8/8.
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.199.160",10010);

        OutputStream os = s.getOutputStream();
        os.write("TCP，我来了！".getBytes());

        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("client:"+data);

        s.close();
    }
}
