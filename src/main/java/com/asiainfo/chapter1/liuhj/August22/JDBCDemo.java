package com.asiainfo.chapter1.liuhj.August22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("加载驱动成功");
            String url ="jdbc:mysql://localhost:3306/test";
            String username = "root";
            String password ="root";
            Connection connection = DriverManager.getConnection(url,username,password);
            if (connection !=null){
                System.out.println("数据库连接成功！");
                connection.close();
            }else {
                System.out.println("数据库连接失败");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();

        }


    }

}
