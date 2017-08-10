package com.asiainfo.chapter1.fengzx.DeliverWork;

import java.io.*;
import java.net.Socket;

/**
 * Created by fengzx on 2017/8/8.
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",3333);

        BufferedReader br = new BufferedReader(new FileReader("G:\\通讯录.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        s.shutdownOutput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = reader.readLine();
        System.out.println("client"+data);

        br.close();
        s.close();
    }
}
