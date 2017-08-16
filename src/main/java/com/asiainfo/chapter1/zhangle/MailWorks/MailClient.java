package com.asiainfo.chapter1.zhangle.MailWorks;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by del on 2017/8/12.
 */
public class MailClient {
    static Scanner sc=new Scanner(System.in);
    static MailArray ma=new MailArray();
    public static void main(String[] args) {
        //构建客户端对象
        try {
            Socket socket=new Socket("localhost",8000);

            //接收输入的信息
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            //将信息写入到Socket内
            PrintWriter pwr=new PrintWriter(socket.getOutputStream());
            // 获取输出流，向服务器打印信息
            OutputStream os=socket.getOutputStream();
            //包装成打印流
            PrintWriter pw=new PrintWriter(os);
           while (true) {
                System.out.println("请选择读取所有信息(按1)|查询个人信息(输入手机号):");
                String num = sc.next();
                if (num.equals("1")) {
                   System.out.println("读取所有");
                    ma.main();  //读取成功但会报异常不知道什么原因
                    pw.write("查询所有");
                    //刷新缓存
                    pw.flush();
                    //关闭Socket的输出流
                    //socket.shutdownOutput();
                }else {
                    System.out.println("查询个人信息");
                    Mail mail=ma.select(num);
                    System.out.println("name="+mail.getName());
                    System.out.println("telephone="+mail.getTelephone());
                    System.out.println("address="+mail.getAddress());
                    System.out.println("email="+mail.getEmail());
                    System.out.println("born="+mail.getBorn());
                    pw.write("查询个人完成");
                    //刷新缓存
                    pw.flush();
                    //关闭Socket的输出流
                    //socket.shutdownOutput();

                }
                //关闭Socket的输出流
               //socket.shutdownOutput();
            }

        } catch (IOException e) {
            System.out.println("socket异常");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("\n调用MailArray类的main方法失败");
        }

    }
}
