package com.asiainfo.chapter1.fengzx.DeliverWork;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.Properties;

/**
 * Created by fengzx on 2017/8/8.
 */
public class DButil {
    private static String url = null;
    private static String user = null;
    private static String password = null;
    private static String driverClass = null;

    public static Connection getConn() {
        Connection conn =  null;
        try {
            Properties prop = new Properties();
            prop.load(DButil.class.getResourceAsStream("db.properties"));
            url = prop.getProperty("url");
            user = prop.getProperty("user");
            password = prop.getProperty("password");
            driverClass = prop.getProperty("driverClass");

            Class.forName(driverClass);
            conn = DriverManager.getConnection(url, user, password);
//            Class.forName("com.mysql.jdbc.Driver");
//            conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/contactlist", "root", "root");
            Statement stmt = conn.createStatement();
        }catch (SQLException e){
            System.out.println("数据库连接异常："+e);
        } catch (ClassNotFoundException e) {
            System.out.println("找不到类");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return conn;
    }

}
