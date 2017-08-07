package com.asiainfo.chapter1.luomin.net.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Luoo2
 * @create 2017-08-07 0:19
 */

public class LoginServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(4013);
        while (true) {
            Socket s = ss.accept();
            new Thread(new UserThread(s)).start();
        }
    }

}
