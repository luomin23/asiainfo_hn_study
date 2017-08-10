package com.asiainfo.chapter1.liuhj.August09.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //客户端发数据到服务器端
        /*
        *tcp传输，客户端建立的过程
        * 1 创建tcp客户端的socket服务，使用的是socket对象
        * 建议该对象已建立就明确目的地，要连接的主机
        *
        * 2 如果连接建立成功，说明数据传输通道已建立
        * 该通道就是socket流，是底层建立好的。既然是流就说明这里有输入也有输出。
        * 想要输出或输出流对象，可以找Socket来获取
        * 可以通过getOutPutStream()和getInputStream()来获取两个字节流
        *
        *3使用输出流将数据写出
        *
        * 4关闭资源
        *
        *
        *
        * */
        //创建socket服务
        Socket socket= new Socket("192.168.1.100",10002);
        //获取socket流中的输出流
        OutputStream out =socket.getOutputStream();
        //使用输出流将制定的数据写出去
        out.write("tcp演示".getBytes());
          socket.close();

    }



}
