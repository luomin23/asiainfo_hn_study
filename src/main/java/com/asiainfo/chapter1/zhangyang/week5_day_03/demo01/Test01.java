package com.asiainfo.chapter1.zhangyang.week5_day_03.demo01;

import java.io.*;
import java.sql.*;

/**
 * Created by 11 on 2017/8/9.
 */
public class Test01 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");//加载JDbc
                System.out.println("JDBC加载成功！");
            } catch (ClassNotFoundException e) {
                System.out.println("JDBC加载失败！");
                e.printStackTrace();
            }
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/telephone","root","");
                System.out.println("mysql连接成功！");
            } catch (SQLException e) {
                System.out.println("mysql连接失败！");
                e.printStackTrace();
            }finally{
            try {
                TxtToSql.insert(st,conn);
                conn.close();
                System.out.println("mysql关闭成功！");
            } catch (SQLException e) {
                System.out.println("mysql关闭失败！");
                e.printStackTrace();
            }
        }
    }
}
 class TxtToSql {
     public  static void insert(Statement st,Connection conn){
         InputStreamReader isr = null;
         BufferedReader br = null;
         OutputStream out = null;
         try {
             InputStream inputStream = new FileInputStream("G:\\Javaio\\10\\java002.txt");
             isr = new InputStreamReader(inputStream);
             br = new BufferedReader(isr);
             String line = null;
             StringBuffer strb = new StringBuffer();
             try {
                 while ((line = br.readLine())!=null){
                     strb.append(line+"\n");
                     String [] str = line.split(",");
                     for (int i = 0; i <str.length ; i++) {
                         System.out.println(str);
                     }
                     String sql="insert into list values('"+str[0]+"','"+str[1]+"',"+str[2]+")";
                     try {
                         st = (Statement) conn.createStatement();
                         st.executeUpdate(sql);
                     } catch (SQLException e) {
                         e.printStackTrace();
                     }
                 }
             } catch (IOException e) {
                 e.printStackTrace();
             }
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }
     }
}
