package com.asiainfo.chapter1.liangzhiqiang.BBSzuoye;

/**
 * Created by 君不悔 on 2017/8/23.
 */
import java.sql.*;

public class JdbcUtil{
    static{
        try{
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException{
        //return DriverManager.getConnection("jdbc:odbc:address");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/user_table?user=root&password=root&characterEncoding=utf-8");
    }

    public static void close(Statement stmt,Connection conn)throws SQLException{
        stmt.close();
        conn.close();
    }

    public static void close(ResultSet rs,Statement stmt,Connection conn)throws SQLException{
        rs.close();
        close(stmt,conn);
    }

}