package com.asiainfo.chapter1.luhui.zuoye;

import com.asiainfo.chapter1.luhui.luhui10.MySQL;
import com.asiainfo.chapter1.luhui.luhui11.SQL;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.*;
import java.util.Scanner;

/**
 * Created by 18237161432 on 2017/8/8.
 */
//客户端;
public class serversockettest{


    public static void main(String[] args) throws ClassNotFoundException {


        try {
            Socket socket = new Socket("127.0.0.1", 8888);
            File file = new File("D:\\ideaIU\\Git\\lh\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\luhui\\zuoye\\a.txt");
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            String line = null;
            while ((line = buffer.readLine()) != null) {
                out.println(line);
                System.out.println("客户端读取文件里的内容" + line);
            }

            System.out.println("客户端发完了");
            BufferedReader bufin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            socket.shutdownOutput();
            String result = bufin.readLine();
            System.out.println("客户端接收到了服务器的数据了");
            System.out.println(result);
            //关闭流
            bufin.close();
            buffer.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


