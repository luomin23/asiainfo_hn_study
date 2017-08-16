package com.asiainfo.chapter1.zhangle.MailWorks;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by del on 2017/8/12.
 */
public class MailServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(8000);
            System.out.println("服务器准备开始......");

            //循环监听
            while (true) {
                Socket s = ss.accept();

                //发送信息线程
                MailSend ms=new MailSend(s);
                ms.start();
            }

        } catch (IOException e) {
            System.out.println("连接异常");
        }catch (Exception e){
            System.out.println("服务器异常");
            e.printStackTrace();
        }

    }
}
