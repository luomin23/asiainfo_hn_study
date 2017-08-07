package com.asiainfo.chapter1.luomin.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
  * 演示tcp的传输的客户端和服务器端的互访。
  * 需求是：客户端给服务端发送数据，服务器
  * 端收到数据后，给客户端反馈信息
  */
  /**
  * 客户端步骤：
  *    1）建立socket服务，指定要连接的主机和端口
  *    2）获取socket流中输出流，将数据写到该流中
  *       通过网络发送到服务器端
  *    3）获取socket流中输入流，将服务端反馈的数
  *       据获取到并打印到控制台上
  *    4）关闭客户端资源
 */

public class TcpClient2 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("127.0.0.1", 10007);
        OutputStream out = s.getOutputStream();
        out.write("服务端，你好".getBytes());
        InputStream in = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf, 0, len));
        s.close();
    }

}
