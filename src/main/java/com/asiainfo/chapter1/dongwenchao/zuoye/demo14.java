package com.asiainfo.chapter1.dongwenchao.zuoye;
import java.io.*;
import java.net.Socket;
/**
 * Created by 超超 on 2017/8/7 0007.
 */
//客户端
public class demo14 {
    public static void main(String[] args) throws Exception
    {
        //建立Socket服务
        Socket fileLoaderSocket = new Socket("192.168.17.1", 1);
        OutputStream out = fileLoaderSocket.getOutputStream();//getOutputStream()方法是返回此套接字的输出流。返回是将字节写入此套接字的输出流。
        //实例化对象fileReader
        FileInputStream fileRead = new FileInputStream("D:\\Java\\Git\\test\\asiainfo_hn_study\\a.txt");//FileInputStream 从文件系统中的某个文件中获得输入字节。哪些文件可用取决于主机环境。
        //建立数组
        byte[] buf = new byte[1024];
        int len = 0;
        //判断是否读到文件末尾
        while((len=fileRead.read(buf)) != -1)
        {
            out.write(buf, 0, len);//写入流
        }
        //告诉服务端，文件已传输完毕
        fileLoaderSocket.shutdownOutput();//没有（不让）其他的用这个套接字的输出流
        //获取从服务端反馈的信息
        BufferedReader in = new BufferedReader(new InputStreamReader(fileLoaderSocket.getInputStream()));//从字符输入流中读取文本
        String serverBack = in.readLine();
        System.out.println(serverBack);
        //资源关闭
        fileLoaderSocket.close();
        fileRead.close();
    }
}
