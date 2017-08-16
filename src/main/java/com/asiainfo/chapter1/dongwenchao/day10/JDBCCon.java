package com.asiainfo.chapter1.dongwenchao.day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by 超超 on 2017/8/15 0015.
 */
public class JDBCCon {
    private String driverName="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql";
    private String user="root";
    private String password="";

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String newDriverName) {
        driverName = newDriverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String newUrl) {
        url = newUrl;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String newUser) {
        user = newUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }
    public Connection getConnection(){
        try {
            Class.forName(driverName);
        }catch (Exception e){
            System.out.println("驱动程序出问题"+e.getCause());
            try {
                return DriverManager.getConnection(url, user, password);
            }catch (SQLException e1){
                System.out.println("连接异常"+e.getCause());
            }
        }
        return null;
    }
}
