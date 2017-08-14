package com.asiainfo.chapter1.liangzhiqiang.zuoye;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.net.UnknownHostException;

/**
 * Created by 君不悔 on 2017/8/13.
 */
//客户端
public class Client {
        public static Socket socket;
        public static DataInputStream input;
        public static DataOutputStream output;
        public static void main(String[] args) {
            try{
                socket=new Socket("127.0.0.1",8000);
                input=new DataInputStream(socket.getInputStream());
                output=new DataOutputStream(socket.getOutputStream());
                System.out.println("请输入号码：");
                Scanner s=new Scanner(System.in);
                String a=s.next();
                output.writeUTF(a);
                System.out.println(a+"的信息为： ");
                try {
                    System.out.println(input.readUTF());
                }catch (Exception e){
                    System.out.println("没有"+a+"的信息,请重新输入号码");
                }

                input.close();
                output.close();
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }