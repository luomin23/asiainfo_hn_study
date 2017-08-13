package com.asiainfo.chapter1.wangjz.java.javaday1.javazuoye;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by wjz123456 on 2017/8/11.
 */
public class TcpClient{
    public static Socket socket;
    public static DataInputStream input;
    public static DataOutputStream output;
    public static void main(String[] args) {
        try{
            socket=new Socket("127.0.0.1",7600);
            input=new DataInputStream(socket.getInputStream());
            output=new DataOutputStream(socket.getOutputStream());
            System.out.println("请输入姓名：");
           Scanner s=new Scanner(System.in);
            String a=s.next();
            output.writeUTF(a);
            System.out.println(a+"的信息为： ");
            try {
                System.out.println(input.readUTF());
            }catch (Exception e){
                System.out.println("没有"+a+"的信息,请重新输入姓名...");
            }

             input.close();
            output.close();
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
