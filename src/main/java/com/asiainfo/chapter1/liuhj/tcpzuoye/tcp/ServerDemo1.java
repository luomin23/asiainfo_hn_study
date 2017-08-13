package com.asiainfo.chapter1.liuhj.tcpzuoye.tcp;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;

public class ServerDemo1 {
    static String a;
    public static String select(int n){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            String sql="select * from student where id=1";
            PreparedStatement statement=con.prepareStatement(sql);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                a="姓名："+resultSet.getString(1)+"\t"+"年龄："+resultSet.getString(2)+"\t"+"地址："+resultSet.getString(3)+
                        "\t"+"电话："+resultSet.getString(4)+"\t";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
    public static void main(String[] args) {
        try {
            ServerSocket zz =new ServerSocket(7502);
            Socket socket  =zz.accept();
            DataInputStream  in =new DataInputStream(socket.getInputStream());
            String a=in.readUTF();
            in.close();
            socket.close();
            System.out.println(a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    System.out.println(select(1));
        try {
            FileWriter f=new FileWriter("F:\\Git\\lhjworkspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\liuhj\\tcpzuoye\\tcp\\writerlhj.txt.txt");
            f.write(a);
            f.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
