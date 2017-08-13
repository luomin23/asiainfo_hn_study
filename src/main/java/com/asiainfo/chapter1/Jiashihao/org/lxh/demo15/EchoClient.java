package com.asiainfo.chapter1.Jiashihao.org.lxh.demo15;

/**
 * Created by lenovo on 2017/8/8.
 */
import java.net.*;
import java.io.*;
public class EchoClient {
    public static void main(String args[]) throws Exception{
        Socket client = null;
        client = new Socket("localhost",8888);
        BufferedReader buf = null;
        PrintStream out = null;
        BufferedReader input = null;
        input = new BufferedReader(
         new InputStreamReader(System.in));
        out = new PrintStream(
                client.getOutputStream());
        buf = new BufferedReader(
                new InputStreamReader(
                        client.getInputStream()));
        boolean flag = true;
        while(flag){
            System.out.print("输入信息:");
            String str = input.readLine();
            out.println(str);
            if ("end".equals(str)){
                flag = false;
            }else{
                String echo = buf.readLine();
                System.out.println(echo);
            }
        }
        client.close();
        buf.close();
    }
};
