package com.asiainfo.chapter1.Jiashihao.org.lxh.demo15;

/**
 * Created by lenovo on 2017/8/8.
 */
import java.net.*;
import java.io.*;
public class EchoServer {
    public static void main(String args[]) throws Exception{
        ServerSocket server = null;
        Socket client = null;
        PrintStream out = null;
        BufferedReader buf = null;
        server = new ServerSocket(8888);
        boolean f = true;
        while(f){
            System.out.println("运行中，等待连接。");
            buf = new BufferedReader(
                    new InputStreamReader(
                            client.getInputStream()));
            out = new PrintStream(
                    client.getOutputStream());
            boolean flag = true;
            while(flag){
                String str = buf.readLine();
                if(str == null||"".equals(str)){
                    flag = false;
                }else{
                    if("end".equals(str)){
                        flag = false;
                    }else{
                        out.println("ECHO:"+str);
                    }
                }
            }
            out.close();
            client.close();
        }
        server.close();
    }
};
