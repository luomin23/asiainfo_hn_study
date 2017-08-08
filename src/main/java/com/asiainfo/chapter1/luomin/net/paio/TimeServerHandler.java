package com.asiainfo.chapter1.luomin.net.paio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

/**
 * 处理客户端请求的类
 *
 */
public class TimeServerHandler implements Runnable {

    private Socket socket;

    public TimeServerHandler(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            //在socket上建立输入输出
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream(), "utf-8"));
            out = new PrintWriter(this.socket.getOutputStream(), true);

            String currentTime = null;
            String body = null;

            while (true) {
                body = in.readLine();//读入一行
                if (body == null) {
                    break;
                }
                System.out.println("TimeServer收到消息：" + body);

                //如果收到请求时间的命令则返回当前时间
                if ("order:current time".equalsIgnoreCase(body)) {
                    currentTime = new Date(System.currentTimeMillis()).toString();
                } else {
                    currentTime = "无效的命令";
                }
                out.println(currentTime);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                    in = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (out != null) {
                out.close();
                out = null;
            }

            if (this.socket != null) {
                try {
                    this.socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.socket = null;
            }
        }
    }
}