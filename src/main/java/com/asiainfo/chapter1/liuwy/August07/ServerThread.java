package com.asiainfo.chapter1.liuwy.August07;



import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by LENOVO on 2017/8/7.
 */
public class ServerThread {
    public static void main(String[] args){
        System.out.println("服务器开启！");
        try {
            ServerSocket serverSocket=new ServerSocket(9999);
            while (true){
                Socket socket=serverSocket.accept();
                ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
                Request request=(Request) ois.readObject();
                //Request request=(Request) ois.readObject();
//                switch (request.getServiceName()){
//                    case ConfigUtils.FINDALL:
//                        System.out.println("你调用了一次FINDALL");
//                        break;
//                    case ConfigUtils.FINBYID:
//                        System.out.println("你调用了一次FINBYID");
//                        break;
//                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
