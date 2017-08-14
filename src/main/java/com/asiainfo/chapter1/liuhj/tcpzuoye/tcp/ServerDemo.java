package com.asiainfo.chapter1.liuhj.tcpzuoye.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ServerDemo {
    public static Socket socket;
    public static DataOutputStream outputStream;
    public static DataInputStream inputStream;
    static  String d;
    public static void main(String[] args) {
        /*
         * 建立tcp服务端思路
         * 1 创建服务器socket服务,通过Serversocket对象
         *2 服务端必须提供一个端口，否则客户端无法连接
         * 3 获取连接过来的客户端对象
         * 4  通过客户端对象获取socket流读取客户端发来的数据
         *     并打印在控制台上
         * 5  关闭资源  关客户端 关服务端
         * */
        //1 创建服务端对象
        //对象获取输入流
        //2 获取连接过来的客户端对象。

        try {
            ServerSocket ss =new ServerSocket(7501);
            socket  =ss.accept();        //获取连接过来的客户端对象
            inputStream=new DataInputStream(socket.getInputStream());
            outputStream=new DataOutputStream(socket.getOutputStream());
            //3 输出流给客户端返回数据
            //outputStream.writeUTF("你叫什么名字");
              d= inputStream.readUTF();
            System.out.println(d);
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String id=d.substring(6,7);
            String name=d.substring(10,13);
            String age=d.substring(18,19);
            String clas=d.substring(26,31);

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            Statement stmt=con.createStatement();
             String sql="insert into student values('"+id+"','"+name+"','"+age+"','"+clas+"')";
             boolean resultSet=stmt.execute(sql);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }






    }



}
