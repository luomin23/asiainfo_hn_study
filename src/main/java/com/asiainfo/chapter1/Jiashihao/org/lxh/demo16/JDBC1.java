package com.asiainfo.chapter1.Jiashihao.org.lxh.demo16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class Demo1{
    String name;
    String num;
    public String getName() {
        return name;
    }
    public String getNum() {
        return num;
    }
    public String getEmail() {
        return email;
    }
    public String getBir() {
        return bir;
    }
    String email;
    String bir;
    public void setName(String name){
        this.name=name;
    }
    public void setNum(String num){
        this.num=num;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setBir(String bir){
        this.bir=bir;
    }
}
public class JDBC1 {


    public static void main(String[] args)  {
        // TODO Auto-generated method stub
        File f=new File("d:\\test\\test.txt");

        Demo1 demo=new Demo1();


        try {
            FileReader inOne = new FileReader(f);
            BufferedReader inTwo = new BufferedReader(inOne);

            String s=null;
            int i=0;

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","SYSTEM","2996");

            String sql="INSERT INTO 通讯录 (name,num,email,bir)VALUES(?,?,?,?)";

            PreparedStatement ps=con.prepareStatement(sql);
            while((s=inTwo.readLine())!=null) {
                String st[]=s.split(" ");
                demo.setName(st[0]);
                demo.setNum(st[1]);
                demo.setEmail(st[2]);
                demo.setBir(st[3]);

                ps.setString(1,demo.getName());
                ps.setString(2,demo.getNum());
                ps.setString(3,demo.getEmail());
                ps.setString(4,demo.getBir());
                ps.executeUpdate();


                i++;}	inTwo.close();
            ps.close();
            con.close();


        } catch (Exception e2) {
            
            e2.printStackTrace();
        }//第一部分从文件中取出数据

//将数据存入之前建好的通讯录表中
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入想要查询的号码");
        String a=sc.next();


        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl","SYSTEM ","2996");

            String sql1="select *"+"from 通讯录 where num =?";
            PreparedStatement ps1=con1.prepareStatement(sql1);
            ps1.setString(1,a);

            ps1.executeUpdate();
            ResultSet rs=ps1.executeQuery();
            while(rs.next()) {
                String name=rs.getString(1);
                String num=rs.getString(2);
                String email=rs.getString(3);
                String bir=rs.getString(4);
                System.out.print("姓名"+name+";");
                System.out.print("电话号码"+num+";");
                System.out.print("邮箱"+email+";");
                System.out.print("出生年月"+bir+";");

            }
            rs.close();
            ps1.close();
            con1.close();

        } catch (Exception e) {
            
            e.printStackTrace();
        }


    }
}

