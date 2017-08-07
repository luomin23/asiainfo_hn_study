package com.asiainfo.chapter1.luomin.net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
  * 客户端通过键盘录入用户名
  * 服务器端对这个用户名进行校验。
  * 如果该用户名存在，在服务器端显示xxxx，已登录。
  * 并在客户端显示xxx，欢迎光临。
  * 如果该用户不存在，在服务器端显示xxxx，尝试登陆。
  * 并在客户端显示xxxx，该用户不存在。
  * 最多登陆3次，3次后结束。
  * @author wl-pc
 */

public class LoginClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
                 Socket s = new Socket("127.0.0.1",4013);
                 //用于接收客户端的输入的信息
                 BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
                 PrintWriter out =new PrintWriter(s.getOutputStream(),true);
                 //反馈服务器端发来的反馈信息
                 BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
                 for(int i=0;i<3;i++){
                      String line = bufr.readLine();
                      if(line==null)
                          break;
                     out.println(line);
                     String info = bufIn.readLine();
                     System.out.println("info:" + info);
                     if (info.contains("欢迎"))  //包含欢迎字符，就停止
                         break;
                  }
                 bufr.close();
                 s.close();
            }

}
