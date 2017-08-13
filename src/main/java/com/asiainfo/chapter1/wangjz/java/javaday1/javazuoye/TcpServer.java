package com.asiainfo.chapter1.wangjz.java.javaday1.javazuoye;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;

/**
 * Created by wjz123456 on 2017/8/11.
 */
public class TcpServer {
     static String a;
    public static Socket socket;
    public static DataInputStream input;
    public static DataOutputStream output;
    public static String select(String n){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123456");
            String sql="select * from txl where name=?";
            PreparedStatement statement=con.prepareStatement(sql);
            statement.setString(1,n);
            ResultSet resultSet=statement.executeQuery();
                while (resultSet.next()){
                    a="姓名："+resultSet.getString(1)+"\t"+"年龄："+resultSet.getString(2)+"\t"+"地址："+resultSet.getString(3)+"\t"+"电话："+resultSet.getString(4)+"\t"+"邮箱："+resultSet.getString(5)+"\t";
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
    public static void main(String[] args) {
        try{
            ServerSocket server=new ServerSocket(7600);
            socket=server.accept();
            input=new DataInputStream(socket.getInputStream());
            output=new DataOutputStream(socket.getOutputStream());
            String aa=input.readUTF();
            System.out.println("你要查询"+aa+"的信息...");
            select(aa);
            FileWriter f=new FileWriter("txl.txt");
            try{

                f.write(a);
                f.flush();
            }catch (Exception e){

            }
            try {
                output.writeUTF(a);
            }catch (Exception e){
                System.out.println("Sorry，，，没有"+aa+"的信息");
            }

            input.close();
            output.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
