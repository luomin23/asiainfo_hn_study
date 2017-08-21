package com.asiainfo.chapter1.zhangle.BBSWorks.JDBCUtil;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by del on 2017/8/21.
 */
public class JDBC {
    private static Properties properties=new Properties();
    static{
        //通过相对路径打开文件输入流
        //将文件当中的数据放到集合当中
        try {
            InputStream is= JDBC.class.getResourceAsStream("mysql.properties");
            properties.load(is);
        } catch (Exception e) {
            System.out.println("找不到上面的配置文件出错:");
        }

    }
    /*连接数据库操作*/
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        //加载驱动  其中(驱动名)
        Connection conn = null;
        try {Class.forName(properties.getProperty("driver"));
            //连接数据库  通过Properties得到url、username、password
            conn = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return  conn;
    }
    /*  关闭数据库连接--查询数据库  */
    //关闭资源
    public static void close(Connection conn,PreparedStatement pstm,ResultSet rs){
        if(rs!=null){try{rs.close();}catch(Exception e){}}
        if(pstm!=null){try{pstm.close();}catch(Exception e){}}
        if(conn!=null){try{conn.close();}catch(Exception e){}}
    }
    /*  关闭数据库连接--修改、删除、更新  */
    public static void close(Connection conn,PreparedStatement pstm){
        if(pstm!=null){try{pstm.close();}catch(Exception e){}}
        if(conn!=null){try{conn.close();}catch(Exception e){}}
    }


}

