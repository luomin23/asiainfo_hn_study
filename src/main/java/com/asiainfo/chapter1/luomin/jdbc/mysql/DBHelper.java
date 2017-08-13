package com.asiainfo.chapter1.luomin.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Luoo2
 * @create 2017-08-12 21:14
 */

public class DBHelper {
    public static final String url = "jdbc:mysql://127.0.0.1/test";
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String username = "root";
    public static final String password = "12345";



    public static Connection getConn() {

        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }



}
