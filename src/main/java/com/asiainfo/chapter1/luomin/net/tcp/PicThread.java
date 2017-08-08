package com.asiainfo.chapter1.luomin.net.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 这个服务端有个局限性：当A客户连接上时，被服务端获取到，
 * 服务端执行具体执行流程，这时B客户连接时，连不上，只有
 * 等待，因为服务器端还没有处理完A的请求，还没有循环回来
 * 执行下一次的accept()方法，所以暂时获取不到B客户对象。
 * 那么为了可以让多个客户端同时并发访问服务端，那么服务端
 * 最好是将每个客户端封装到一个单独的线程中，这样，就可以
 * 同时处理多个客户端请求。
 *
 * 那么如何定义线程呢？
 * 只要明确了每一个客户端要在服务端执行的代码即可，将代码
 * 写在run()方法中即可。
 *
 */

public class PicThread implements Runnable {
    private Socket s;

    PicThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        int count = 1;
        String ip = s.getInetAddress().getHostAddress();
        try {
            System.out.println(ip + ".....connected");
            InputStream in = s.getInputStream();
            File file = new File("C:\\idea_workspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\luomin\\net\\tcp\\" + ip + "(" + (count) + ")" + ".jpg");
            while (file.exists()) {
                file = new File("C:\\idea_workspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\luomin\\net\\tcp\\" + ip + "(" + (count++) + ")" + ".jpg");
            }
            FileOutputStream fos = new FileOutputStream(file);
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = in.read(buf)) != -1) {
                fos.write(buf, 0, len);
                fos.flush();
            }
            OutputStream out = s.getOutputStream();
            out.write("上传成功！".getBytes());
            fos.close();
            s.close();
        } catch (Exception e) {
            throw new RuntimeException(ip + "上传失败！");
        }
    }

}

