package com.asiainfo.chapter1.luhui.luhui11;

import com.asiainfo.chapter1.luhui.luhui10.MySQL;
import com.sun.corba.se.spi.activation.Server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * Created by 18237161432 on 2017/8/8.
 */
public class sockettest {
    MySQL onecon=new MySQL();
    Connection con=null;
    Statement stmt=null;
    PreparedStatement pstmt=null;
    public static void main(String[] args){

        try{
             ServerSocket serversocket=new ServerSocket(8888);//服务器端；
             java.net.Socket socket=serversocket.accept();
            BufferedReader bufin=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufw=new BufferedWriter(new FileWriter("D:\\ideaIU\\Git\\lh\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\luhui\\b.txt"));
            String line1=null;
            while((line1=bufin.readLine())!=null){
                System.out.println(line1);

                bufw.write(line1,0,line1.length());
                bufw.write("\n");
            }
           /* bufw.flush();
            String line="";
          String s=null;
            BufferedReader b=new BufferedReader(new FileReader("b.txt"));
            while((line=b.readLine())!=null) {
                System.out.println(line);
                 s=line.substring(0,1);
                // m=s;
                System.out.println(s);
            }
            System.out.println(s);*/


            //定义字符串长度；
           /* String f=line1;
            System.out.println(f);*/
           /* int start=0;
            int end=2;
            char h[]=new char[end-start];
            f.getChars(start,end,h,0);
            System.out.println(h);*/

            System.out.println("服务器接收完了");
            PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
            out.println("上传成功");
            System.out.println("服务器反馈客户端完了");
           // b.close();
            bufw.close();
            socket.close();
            serversocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //添加数据；
        sql2 c=new sql2();
        int count=c.addStudentDataInfo("2017106","爱玲",20,"infomation","陆辉");
        System.out.println(count+"条记录被添加到数据表中");
    }


    public int addStudentDataInfo(String sno,String sname,int sage,String smajor,String sd) {
    int count=0;
    try {
        con=onecon.getConnection();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    try{
        String str="insert into s2 values(?,?,?,?,?)";
        pstmt=con.prepareStatement(str);//与createStatement相比prepareStatement更有优势，尽量用后者；
        pstmt.setString(1,sno);
        pstmt.setString(2,sname);
        pstmt.setInt(3,sage);
        pstmt.setString(4,smajor);
        pstmt.setString(5,sd);
        count=pstmt.executeUpdate();
    }catch(SQLException e1){
        System.out.println(e1);
    }finally{
        try{
            pstmt.close();
            con.close();
        }catch(SQLException e){
            System.out.println("关闭出现问题"+e);
        }
    }
    return count;
}}


