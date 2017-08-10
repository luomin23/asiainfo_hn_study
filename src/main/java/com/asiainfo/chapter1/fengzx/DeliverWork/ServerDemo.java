package com.asiainfo.chapter1.fengzx.DeliverWork;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by fengzx on 2017/8/8.
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(3333);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\通讯录copy.txt"));

        String line = null;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        writer.write("文件上传成功");
        writer.newLine();
        writer.flush();

        bw.close();
        s.close();
        ss.close();
    }
}
