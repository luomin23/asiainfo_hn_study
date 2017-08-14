package com.asiainfo.chapter1.dongwenchao.zuoye;

import com.asiainfo.chapter1.dongwenchao.day10.JDBC;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 超超 on 2017/8/10 0010.
 */
//服务器端
public class demo4 {
    JDBC onecon=new JDBC();
    Connection con=null;//保存数据库连接的成员变量
    private PreparedStatement pstmt=null;
    public String chaxunone(String Id){
        String a=null;
        con=onecon.getConn();
        ResultSet rs;
        try{
            pstmt=con.prepareStatement( " SELECT * FROM students WHERE Id=?");
            pstmt.setString(1,Id);
            rs=pstmt.executeQuery();
            while (rs.next()){
                 a="编号："+rs.getString(1)+"\t"+"姓名："+rs.getString(2)+"\t"+"性别："+rs.getString(3)+"\t"+"电话："+rs.getString(4)+"\t";
            }
            pstmt.close();
            con.close();
        }catch (SQLException e){
            System.out.println("数据库异常" +e);
        }
        return a;
    }
    public static void main(String[] args) {
        try {
            /** 创建ServerSocket*/
            // 创建一个ServerSocket在端口2013监听客户请求
            ServerSocket serverSocket =new ServerSocket(2014);
            while (true) {
                // 侦听并接受到此Socket的连接,请求到来则产生一个Socket对象，并继续执行
                Socket socket = serverSocket.accept();
                /** 获取客户端传来的信息 */
                // 由Socket对象得到输入流，并构造相应的BufferedReader对象
                BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(socket.getInputStream()));//读客户端的东西
                // 获取从客户端读入的字符串
                String result = bufferedReader.readLine();//给result
                demo1 de=new demo1();
                de.setId(result);
                System.out.print("客户端说: " + result);
                /** 发送服务端准备传输的 */
                // 由Socket对象得到输出流，并构造PrintWriter对象
                demo4 d=new demo4();
                 String n=d.chaxunone(result);
                PrintWriter printWriter =new PrintWriter(socket.getOutputStream());
                printWriter.print("Id为"+result+"的信息:"+n);
                printWriter.flush();
                /** 关闭Socket*/
                printWriter.close();
                bufferedReader.close();
                socket.close();
                d.chaxunone(de.getId());
            }
        }catch (Exception e) {
            System.out.println("Exception:" + e);
        }finally{
        }
    }

}
