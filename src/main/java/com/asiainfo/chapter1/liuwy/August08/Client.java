package com.asiainfo.chapter1.liuwy.August08;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by LENOVO on 2017/8/8.
 */
public class Client {
    public static void main(String[] args){
        try {
            Socket socket=new Socket("127.0.0.1",9999);
            System.out.println(socket);
            OutputStream os=socket.getOutputStream();
            System.out.println("请输入内容：");
            String si=new Scanner(System.in).nextLine();
            os.write(si.getBytes());
            //os.close();
            socket.shutdownOutput();

            InputStream is=socket.getInputStream();
            String s= org.apache.commons.io.IOUtils.toString(is);
            System.out.println(s);
            //is.close();
            socket.shutdownInput();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
