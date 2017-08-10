package com.asiainfo.chapter1.fengzx.Aug08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by fengzx on 2017/8/8.
 */
public class ServerDemo2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(15580);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String line = null;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        s.close();
        ss.close();
    }
}
