package com.asiainfo.chapter1.zhangyang.week7_day_03.jdbc;

import java.sql.*;

/**
 * Created by 11 on 2017/8/21.
 */
public class JDBCUtil {
        static{
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("加载驱动成功!");
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        public static Connection getConnection(){
            String url="jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=utf-8";
            String user="root";
            String password="";
            try {
                System.out.println("连接成功！");
                return DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                System.out.println("失败！");
                e.printStackTrace();
            }
            return null;
        }
        public static void release(Connection conn, Statement ps, ResultSet rs){
            try {
                if(rs != null){
                    rs.close();
                }
                if(ps != null){
                    ps.close();
                }
                if(conn != null){
                    conn.close();
                }

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

