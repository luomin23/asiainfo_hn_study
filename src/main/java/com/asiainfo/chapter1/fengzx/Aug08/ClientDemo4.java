package com.asiainfo.chapter1.fengzx.Aug08;

import java.io.*;
import java.net.Socket;

/**
 * Created by fengzx on 2017/8/8.
 */
public class ClientDemo4 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.199.160",12345);

        BufferedReader br = new BufferedReader(new FileReader("G:\\person.txt"));
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
