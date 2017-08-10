package com.asiainfo.chapter1.luhui.luhui11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;import java.net.Socket;

/**
 * Created by 18237161432 on 2017/8/7.
 */
interface BusinessProtocal{
    static  final int PAY_BILL=1;//缴费业务
    static final int ROAMING_SERVICE=2;//漫游业务
    public void payBill();//缴费接口
    public void roamingService();//漫游接口
}
public abstract class MobileServer implements BusinessProtocal {
    ServerSocket server=null;//定义服务器端套接字
    java.net.Socket socket=null;//定义正在连接服务器的客户端的套接字
    String str;//记录客户的漫游地点
    int fee;//记录客户的缴费金额
    int serviceID;//客户端的业务请求标识
    DataInputStream in;//来自客户端的输入流
    DataOutputStream out;//发送到客户端的输出流
    MobileServer(){
        try{
            server=new ServerSocket(2010);
        }catch (IOException e1){
            System.out.println(e1);
        }
        while (true){
            try{
                System.out.println("等待客户请求");
                socket=server.accept();
                out=new DataOutputStream(socket.getOutputStream());
                in=new DataInputStream(socket.getInputStream());
                while(true){
                    serviceID=in.readInt();
                    switch(serviceID){
                        case PAY_BILL:
                            payBill();
                            break;
                        case ROAMING_SERVICE:
                            roamingService();
                            break;
                    }
                }
            }catch(Exception e){
               // System.out.println(socket.getIntAddress().getHostName());
            }
        }
    }
}
