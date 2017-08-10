package com.asiainfo.chapter1.luomin.net.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Luoo
 * @create 2017-08-07 11:13
 */

public class PicThreadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(4008);
        while(true){  //本意要实现多人上传图片到服务器端（但是此种方法是不可取的）
            Socket s = ss.accept(); //accept()是阻塞式方法
            new Thread(new PicThread(s)).start();   //利用多线程实现同时上传的功能。
        }
//        ss.close();
    }
}
