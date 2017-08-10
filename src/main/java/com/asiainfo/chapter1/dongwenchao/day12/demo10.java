package com.asiainfo.chapter1.dongwenchao.day12;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

/**
 * Created by 超超 on 2017/8/7 0007.
 */
//客户端
public class demo10 {
    public static void main(String args[]) throws Exception {
        //为了简单起见，所有的异常都直接往外抛
        String host = "192.168.17.1";  //要连接的服务端IP地址
        int port = 8899;   //要连接的服务端对应的监听端口
        //与服务端建立连接
        Socket client = new Socket(host, port);
        //建立连接后就可以往服务端写数据了
        Writer writer = new OutputStreamWriter(client.getOutputStream());
        writer.write("我就是我  董稳超，大小 超超"+"\n");
        writer.write("我就是我  董稳超，大小  超超");
        writer.write("eof");
        writer.flush();
        //写完以后进行读操作
        Reader reader = new InputStreamReader(client.getInputStream());
        char chars[] = new char[64];
        int len;
        StringBuffer sb = new StringBuffer();
        String temp;
        int index;
        while ((len=reader.read(chars)) != -1) {
            temp = new String(chars, 0, len);
            if ((index = temp.indexOf("eof")) != -1) {
                sb.append(temp.substring(0, index));
                break;
            }
            sb.append(new String(chars, 0, len));
        }
        System.out.println("提示信息: " + sb);
        writer.close();
        reader.close();
        client.close();
    }

}
