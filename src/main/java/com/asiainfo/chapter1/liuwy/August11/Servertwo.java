package com.asiainfo.chapter1.liuwy.August11;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by LENOVO on 2017/8/11.
 */
public class Servertwo {
    public static void main(String[] args) {
        System.out.println("服务器开启！");
        try {
            ServerSocket serverSocket=new ServerSocket(9999);
            while(true) {
                Socket socket = serverSocket.accept();
                ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
                Request request=(Request)ois.readObject();
                switch (request.getServiceName()){
                    case ConfigUtils.SAVE:
                        System.out.println("调用save！");
                        break;
                    case ConfigUtils.FINDBYPHONE:
                        System.out.println("调用find！");
                        break;

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
