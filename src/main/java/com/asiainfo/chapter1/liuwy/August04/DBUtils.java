package com.asiainfo.chapter1.liuwy.August04;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by LENOVO on 2017/8/4.
 */
public class DBUtils {
    private static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException,SQLException{
        if (DBUtils.connection==null||DBUtils.connection.isClosed()){
            String username="root";
            String password="root";
            String driver_class="com.mysql.jdbc.Driver";
            String url = "jdbc:MySQL://localhost:3306/liu?useUnicode=true&characterEncoding=utf8";
            Class.forName(driver_class);
            DBUtils.connection= DriverManager.getConnection(url,username,password);
        }
        return DBUtils.connection;
    }

    public static void closeConnection(){
            try {
        if (DBUtils.connection!=null||!DBUtils.connection.isClosed()){
                DBUtils.connection.close();
        }
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}
