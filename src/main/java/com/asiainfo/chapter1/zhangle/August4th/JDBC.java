package com.asiainfo.chapter1.zhangle.August4th;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by del on 2017/8/4.
 */
public class JDBC {
    /*Oracle数据库的连接*/
   /* 方法一*/
   /*
    public static final String DBDRIVER="oracle.jdbc.OracleDriver";
    public static final String DBURL="jdbc:oracle:thin:@localhost:1521:xe";
    public static final String DBUSER="hr";
    public static final String DBPASS="hr";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection conn=null;
        Class.forName(DBDRIVER);  //出现异常
        conn= DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        System.out.println(conn);
        conn.close();

    }*/
    /*方法二： 创建一个Properties集合*/
    private static Properties properties=new Properties();
    static{
        //通过相对路径打开文件输入流
        InputStream is=JDBC.class.getResourceAsStream("jdbc.properties");
        //将文件当中的数据放到集合当中
        try {
            properties.load(is);
        } catch (Exception e) {
            System.out.println("null表示找不到上面的配置文件");
        }

    }
    /*连接数据库操作*/
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        /*
        properties.getProperty("driver")方法将搜索此属性列表中指定键的属性值。
        如果在属性列表中，默认属性列表及其默认值找到了键，然后检查递归。如果未找到该属性的方法返回null。
        */
        //加载驱动  其中(驱动名)
        Class.forName(properties.getProperty("driver"));
        //连接数据库  通过Properties得到url、username、password
        Connection conn= DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
        return  conn;
    }
    /*  关闭数据库连接--查询数据库  */
    public static void close(ResultSet rs, PreparedStatement ps,Connection conn){
        if(rs!= null){
            try {
                rs.close();
            } catch (SQLException e) {
                System.out.println("查询无结果");
            }
        }
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                System.out.println("查询的sql语句有错");
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("连接数据库有错查询的");
            }
        }
    }
    /*  关闭数据库连接--修改、删除、更新  */
    public static void close(PreparedStatement ps,Connection conn){
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                System.out.println("sql语句有错");
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("连接数据库有错");
            }
        }
    }

    /*public static void main(String[] args) {
        System.out.println(is);
    }*/




}
