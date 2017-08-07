package com.asiainfo.chapter1.luomin.net.tcp;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 需求：上传图片
 */

/**
 * 客户端：
 * 步骤：
 * 1）服务端点
 * 2）读取客户端已有的一个图像数据
 * 3）通过socket输出流将数据发给服务端
 * 4）读取服务器端的反馈信息
 * 5）关闭资源
 */

public class PicClient1 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        if (args.length != 1) {
            System.out.println("请选择一个jpg格式的图片");
            return;

        }
        File file = new File(args[0]);
        if (!file.exists() && file.isFile()) {
            System.out.println("该文件有问题，要么是不存在，要么是有问题！");
            return;

        }
        if (!file.getName().endsWith(".jpg")) {
            System.out.println("图片格式错误，请重新选择！");
            return;

        }
        if (file.length() > 1024 * 1024 * 5) {
            System.out.println("上传的文件过大！");
            return;

        }
        Socket s = new Socket("127.0.0.1", 4008);
        FileInputStream fis = new FileInputStream(file);
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
