package com.asiainfo.chapter1.xushuo.ScoketDemo03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by root on 2017/8/12.
 */
public class MyClient03 {
    private Socket socket=null;
    private DataInputStream din;
    private DataOutputStream dout;
    public MyClient03(){
        try {
            socket=new Socket("127.0.0.1",5000);
            //建立连接
            din=new DataInputStream(socket.getInputStream());
            //把读取到的东西，放到Socket进行传输
            dout=new DataOutputStream(new FileOutputStream("C:\\Users\\root\\Desktop\\tt.txt"));
            int i=0;
            byte[]b=new byte[512];
            String s;
            //声明一个字符串用来保护字节
            while((i=din.read(b))>0){
                s=new String(b,"utf-8");
                dout.write(b,0,i);
            }//写入到Socket中的文件
            dout.close();
            din.close();
            socket.close();
        } catch (IOException ex) {
            ex.fillInStackTrace();
        }
    }
    public static void main(String[]args){
        new MyClient03();
        System.out.println("客户端启动成功");

    }
}
