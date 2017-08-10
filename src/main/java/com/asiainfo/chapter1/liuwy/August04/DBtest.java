package com.asiainfo.chapter1.liuwy.August04;

import java.sql.*;

import com.asiainfo.chapter1.liuwy.August04.DBUtils;
/**
 * Created by LENOVO on 2017/8/7.
 */
public class DBtest {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        String username="root";
        String password="root";
        String driver_class="com.mysql.jdbc.Driver";
        String url = "jdbc:MySQL://localhost:3306/liu?useUnicode=true&characterEncoding=utf8";
        Class.forName(driver_class);
        Connection conn= DriverManager.getConnection(url,username,password);

        String sql="select * from types";
        Statement stat=conn.createStatement();
        ResultSet rs=stat.executeQuery(sql);
        while (rs.next()){
            int types=rs.getInt(1);
            String id=rs.getString("typeid");
            String name=rs.getString("typename");
            System.out.println(id+":"+name);
        }
        rs.close();
        stat.close();
    }
}
