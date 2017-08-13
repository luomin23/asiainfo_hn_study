package com.asiainfo.chapter1.liangzhiqiang.zuoye;

/**
 * Created by 君不悔 on 2017/8/13.
 */
//服务端

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
public class UDPServer {
    static String name,age,add,email,tel;
        public static void main(String args[]){
            DatagramSocket dSocket;
            DatagramPacket inPacket;
            byte[] inBuffer = new byte[100];
            String s;
            try {
                //创建DatagramPacket对象，端口号是7600
                dSocket = new DatagramSocket(7600);
                //接收客户端的数据
                while (true) {
                /*创建一个对象用于接收客户端（接收端）发送的数据，
                且包的大小和客户端创建的包的大小一样，用于接收发送端发送的包。*/
                    inPacket = new DatagramPacket(inBuffer, inBuffer.length);
                    dSocket.receive(inPacket);//接收数据报
                    s = new String(inPacket.getData(), 4, inPacket.getLength());
                    System.out.println(s);
                    name=s.substring(0,3);
                    tel=s.substring(6,17);
                    age=s.substring(19,21);
                    add=s.substring(25,27);
                    email=s.substring(30,46);
                    con();

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
    public static void con(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tel","root","root");
        /*System.out.println(conn);*/
        Statement stmt=conn.createStatement();
        String sql="insert into mysql values('"+name+"','"+tel+"','"+age+"','"+add+"','"+email+"')";
        boolean resultSet=stmt.execute(sql);
        conn.close();
    }catch (Exception e){
        e.printStackTrace();
    }
    }

}