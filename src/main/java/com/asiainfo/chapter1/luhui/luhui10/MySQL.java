package com.asiainfo.chapter1.luhui.luhui10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by 18237161432 on 2017/8/4.
 */
public class MySQL {
    Connection con=null;
    public Connection getConnection() throws ClassNotFoundException {
        String conturl="jdbc:mysql://localhost:3306/student";//url
        String username="root";
        String password="root";
        try {
            Class.forName("com.mysql.jdbc.Driver");//加载驱动，数据库第三方jar包中Driver文件；
            con = DriverManager.getConnection(conturl, username, password);//以获取的数据连接参数创建一个数据库连接。
            System.out.println(con);
        }catch(SQLException e){

        }
         return con;
    }
    public void closeConnection() {
        try {
            con.close();//关闭数据库连接对象。

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        MySQL a=new MySQL();
        try {
            a.getConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

