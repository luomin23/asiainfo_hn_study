package com.asiainfo.chapter1.zhangyang.week6_day_05.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by 11 on 2017/8/18.
 */
public class DB {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");//加载JDbc
            System.out.println("JDBC加载成功！");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC加载失败！");
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?useUnicode=true&characterEncoding=utf-8", "root", "");
            System.out.println("mysql连接成功！");
            return conn;
        } catch (SQLException e) {
            System.out.println("mysql连接失败！");
            e.printStackTrace();
            return conn;
        }
    }
    public static  void close(Connection conn){
        if(conn!=null){
            try {
                conn.close();
                System.out.println("数据库关闭成功！");
            } catch (SQLException e) {
                System.out.println("数据库关闭失败！");
                e.printStackTrace();
            }
        }
    }
}
