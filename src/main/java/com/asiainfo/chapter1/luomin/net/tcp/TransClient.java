package com.asiainfo.chapter1.luomin.net.tcp;

import java.io.*;
import java.net.Socket;

/**
 * 需求：建立一个文本转换服务器
 * 客户端给服务器端发送文本，然后服务器端将文件转成大写
 * 再返回给客户端，而且客服端可以不断的进行文本转换，当
 * 客户端输入over时转换就结束了
 *
 *         分析：
 *         客服端：
 *         既然是操作设备上的数据，就可以使用IO技术，按照IO的操作
 *         规律来思考，对于客服端来讲，源：键盘录入。
 *         目的：网络设备（网络输出流），而且操作的是文本数据，
 *         是文本数据可以选择字符流，
 *         步骤：
 *         1）建立服务。
 *         2）获取键盘录入。
 *         3）将数据发给服务端。（重复操作）
 *         4）获取服务端返回的大写数据。（重复操作）
 *         5）结束，关闭资源。
 *         都是文本数据，可以用字符流进行操作。
 *         同时为了提高效率，加入了缓冲技术
 */

/**
  * 该例子出现的问题。
  * 现象：客户端和服务端都在莫名的等待，这是为什么？
  * 因为客户端和服 务器端都有阻塞式的方法，这些方法没有
  * 读到结束标记，那么就一直等，而导致两端，都在等待，
  * 解决方法：就查看阻塞式方法的地方，因为这个地方时
  * 容易出错的地方。
  */


public class TransClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 4002);
        //定义读取键盘数据的流对象
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        //定义目的，将数据写入到socket输出流中，发给服务端
        BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        //定义一个socket读取流，读取服务端反馈的大写信息
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line = null;
        while ((line = bufr.readLine()) != null) {
            if ("over".equals(line))
                break;
            //往服务器端写入要转换的信息
            bufOut.write(line);
            bufOut.newLine();
            bufOut.flush();  //刷新数据
            //读出转换后的大写信息
            String str = bufIn.readLine();
            System.out.println("server::" + str);
        }
        bufr.close();
        s.close();
    }

}
