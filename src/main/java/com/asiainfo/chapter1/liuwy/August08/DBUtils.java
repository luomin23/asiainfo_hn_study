package com.asiainfo.chapter1.liuwy.August08;

import java.sql.*;

/**
 * Created by LENOVO on 2017/8/8.
 */
public class DBUtils {
    private static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (DBUtils.connection == null || connection.isClosed()) {
            String username =PropertiesUtil.getProperty("username");
            String password =PropertiesUtil.getProperty("password");
            String driver_class =PropertiesUtil.getProperty("driver");
            String url =PropertiesUtil.getProperty("url");
            Class.forName(driver_class);
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null || !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) throws Exception {
////        String username = PropertiesUtil.getProperty("username");
////        System.out.println(username);
//
//        String username = "root";
//        String password = "root";
//        String driver_class = "com.mysql.jdbc.Driver";
//        String url = "jdbc:MySQL://localhost:3306/liu?useUnicode=true&characterEncoding=utf8";
//        Class.forName(driver_class);
//        Connection connection = DriverManager.getConnection(url, username, password);
//System.out.println(connection);
//
//        }


   // }
   public static void main(String[] args) {
       try {
           DBUtils.getConnection();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       } catch (SQLException e) {
           e.printStackTrace();
       }
       //System.out.println(connection);
   }
}
