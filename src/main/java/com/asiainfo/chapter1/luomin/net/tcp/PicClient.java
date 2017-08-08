package com.asiainfo.chapter1.luomin.net.tcp;

/**
 * 需求：上传图片
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端：
 * 步骤：
 * 1）服务端点
 * 2）读取客户端已有的一个图像数据
 * 3）通过socket输出流将数据发给服务端
 * 4）读取服务器端的反馈信息
 * 5）关闭资源
 */

public class PicClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("127.0.0.1", 4007);
        FileInputStream fis = new FileInputStream("C:\\idea_workspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\luomin\\net\\tcp\\1.jpg");
        OutputStream out = s.getOutputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf)) != -1) {
            out.write(buf, 0, len);
        }
        s.shutdownOutput(); //告诉客户端数据已经写完
        InputStream in = s.getInputStream();
        byte[] bufIn = new byte[1024];
        int num = in.read(bufIn);
        System.out.println(new String(bufIn, 0, num));
        fis.close();
        s.close();
    }
}
