package com.asiainfo.chapter1.luomin.net.tcp;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Luoo2
 * @create 2017-08-07 0:11
 */

public class TextClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("127.0.0.1", 4006);
        BufferedReader bufr = new BufferedReader(new FileReader("C:\\idea_workspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\luomin\\net\\tcp\\JavassistClient.txt"));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        //out.println(time);
        String line = null;
        while ((line = bufr.readLine()) != null) {
            out.println(line);
        }
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = bufIn.readLine();
        System.out.println(str);
        bufr.close();
        s.close();
    }

}
