package com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.util;
//jdbc的连接与关闭
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
    //public 是为了方便访问 static 是为了让其成为类的成员，而不是对象的成员。final是表明这是个常亮，不能修改
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String url = "jdbc:mysql://localhost/demo?useUnicode=true&characterEncoding=utf-8";
    public static final String name = "root";
    public static final String pwd = "root";


    //获取数据库连接
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName(driver);
            conn= DriverManager.getConnection(url,name,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("数据库连接失败！");
            e.printStackTrace();
        }
        return conn;
    }

    //关闭数据库连接
    public static void closeConnection(Connection conn){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
