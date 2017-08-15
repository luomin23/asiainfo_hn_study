package com.asiainfo.chapter1.dongwenchao.day10;

import java.sql.*;
/**
 * Created by 超超 on 2017/8/4 0004.
 */
public class JDBC {
    public static Connection getConn() {
        Connection conn =  null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/zuoye", "root", "root");
            System.out.println("");
        } catch (ClassNotFoundException e) {
            System.out.println("运行时异常，加载时找不到类的路径");
        }catch (SQLException e){
            System.out.println("数据库异常");
        }
        return conn;
    }
    public static  void close(Connection conn,PreparedStatement stmt){
//        try{
//            stmt.close();
//            conn.close();
//        }catch (SQLException e){
//            e.getMessage();
//        }
    }
}