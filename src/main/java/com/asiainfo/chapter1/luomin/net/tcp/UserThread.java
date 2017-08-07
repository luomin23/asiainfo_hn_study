package com.asiainfo.chapter1.luomin.net.tcp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class UserThread implements Runnable {
    private Socket s;

    UserThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip + "....conneted");
        try {
            for (int i = 0; i < 3; i++) {
                BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String name = bufIn.readLine();
                if (name == null)
                    break;
                BufferedReader bufr = new BufferedReader(new FileReader("F:\\Javajichu\\JavaLianXi\\src\\cn\\itheima\\day07\\user.txt"));
                PrintWriter out = new PrintWriter(s.getOutputStream(),true);
                String line = null;
                boolean flag = false;
                while ((line = bufr.readLine()) != null) {
                    if (line.equals(name)) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(name + ",已经登陆！");
                    out.println(name + ",欢迎光临");
                    break;
                } else {
                    System.out.println(name + ",尝试登陆！");
                    out.println(name + ",该用户名不存在！");
                }
            }
            s.close();
        } catch (Exception e) {
            throw new RuntimeException(ip + "校验失败！");
        }
    }

}
