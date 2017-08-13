package com.asiainfo.chapter1.Jiashihao.org.lxh.demo15;

/**
 * Created by lenovo on 2017/8/10.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class JDBC {
    public static final String DBDRIVER = "";//定义数据库驱动程序
    public static final String DBURL = "jdbc:mysql://localhost:3360/";//连接数据库连接地址
    public static final String DBUSER ="root";//定义数据库连接用户名
    public static final String DBPASS = "2996";//数据库连接密码
    public static void main(String []args) throws Exception{
        Connection conn = null;
        PreparedStatement pstmt = null;
        String name ="JSH";
        String sql = "INSERT INTO userblob(name,txt)VALUES(?,?)";
        Class.forName(DBDRIVER);
        conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);//连接数据时，要写上连接的用户名，密码
        pstmt = conn.prepareStatement(sql);
        File f = new File("d:"+File.separator+"数据库.txt");
        InputStream input = null;
        input = new FileInputStream(f);
        pstmt.setString(1,name);
        pstmt.setBinaryStream(2,input,(int)f.length());
        pstmt.executeUpdate();
        pstmt.close();
        conn.close();
    }
}
