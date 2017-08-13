package com.asiainfo.chapter1.luhui.zuoye;

import com.asiainfo.chapter1.luhui.luhui10.MySQL;
import com.asiainfo.chapter1.luhui.luhui11.sql2;
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
//服务器端；
public class sockettest {
    MySQL onecon=new MySQL();
    Connection con=null;
    Statement stmt=null;
    PreparedStatement pstmt=null;
    public static void main(String[] args){

        try{
            //建立服务端。
             ServerSocket serversocket=new ServerSocket(8888);
            //等待客户端连接。
             java.net.Socket socket=serversocket.accept();
            //接收客户端文件。
            BufferedReader bufin=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //将内容写入。
            BufferedWriter bufw=new BufferedWriter(new FileWriter("D:\\ideaIU\\Git\\lh\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\luhui\\b.txt"));
            String line1=null;
            while((line1=bufin.readLine())!=null){
                System.out.println(line1);
                bufw.write(line1,0,line1.length());
                bufw.write("\n");
            }
          //读取文件信息。
            BufferedReader b=new BufferedReader(new FileReader("D:\\ideaIU\\Git\\lh\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\luhui\\zuoye\\a.txt"));
            String line="";
            String line2="";
            String name;
            String sex;
            String nb;
            line2=b.readLine();
            while((line=b.readLine())!=null) {
                System.out.println(line);
            }
            //将读取数据进行分析，选取固定字节来选取数据内容。
            name=line2.substring(0,3);
            System.out.println("姓名："+name);
            sex=line2.substring(4,6);
            System.out.println("性别："+sex);
            nb=line2.substring(7,18);
            System.out.println("号码："+nb);
            //返回文件上传成功信息。
            PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
            out.println("上传成功");

            out.close();
            b.close();
            bufw.close();
            socket.close();
            serversocket.close();
            //将得到的数据添加进数据库。
            sql2 c=new sql2();
            int count=c.addStudentDataInfo(name,sex,nb);
            System.out.println(count+"条记录被添加到数据表中");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //数据库增加数据。
    public int addStudentDataInfo(String sname,String ssex,String snb) {
    int count=0;
    try {
        con=onecon.getConnection();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    try{
        String str="insert into s3 values(?,?,?)";
        pstmt=con.prepareStatement(str);//与createStatement相比prepareStatement更有优势，尽量用后者；
        pstmt.setString(1,sname);
        pstmt.setString(2,ssex);
        pstmt.setString(3,snb);
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


