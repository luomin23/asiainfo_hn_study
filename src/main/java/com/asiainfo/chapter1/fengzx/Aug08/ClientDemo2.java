package com.asiainfo.chapter1.fengzx.Aug08;


import java.io.*;
import java.net.Socket;

/**
 * Created by fengzx on 2017/8/8.
 */
public class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.199.160",15580);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while ((line = br.readLine()) != null) {
            if ("over".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
    }
}
