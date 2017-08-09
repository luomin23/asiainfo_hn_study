package com.asiainfo.chapter1.fengzx.Aug08;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by fengzx on 2017/8/8.
 */
public class ServerDemo3 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12340);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\bw.txt"));

        String line = null;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        s.close();
        ss.close();
    }
}
