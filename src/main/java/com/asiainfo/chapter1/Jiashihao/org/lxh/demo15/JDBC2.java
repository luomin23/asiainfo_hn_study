package com.asiainfo.chapter1.Jiashihao.org.lxh.demo15;

/**
 * Created by lenovo on 2017/8/10.
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class JDBC2 {
    public static final String DBDRIVER = "";//定义数据库驱动程序
    public static final String DBURL = "jdbc:mysql://localhost:3360/";//连接数据库连接地址
    public static final String DBUSER = "root";//定义数据库连接用户名
    public static final String DBPASS = "2996";//数据库连接密码

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int id = 1;
        String sql = "SELECT name,txt FROM userblob WHERE id=?";
        Class.forName(DBDRIVER);
        conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);//连接数据时，要写上连接的用户名，密码
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,id);
        rs = pstmt.executeQuery();
        if(rs.next()){
            String name = rs.getString(1);
            System.out.println("文本:"+ name);
            InputStream input = rs.getAsciiStream(2);
            FileOutputStream out = null;
            out = new FileOutputStream(
                    new File("d:" + File.separator+ "shujuku.txt"));
            int temp = 0;
            while((temp=input.read())!=-1){
                out.write(temp);
            }
            input.close();
            out.close();
        }
        pstmt.close();
        conn.close();
    }
}