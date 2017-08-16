package com.asiainfo.chapter1.zhangyang.week5_day_06;


import com.mysql.jdbc.PreparedStatement;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by 11 on 2017/8/13.
 */
public class sqlUtil {
    public static void insert() {
        Connection conn= JDBC.getConnection();
        Statement st=null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        OutputStream out = null;
        try {
            InputStream inputStream = new FileInputStream("D:\\work\\Git\\gitworkspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\zhangyang\\week5_day_06\\b.txt");
            isr = new InputStreamReader(inputStream);
            br = new BufferedReader(isr);
            String line = null;
            StringBuffer strb = new StringBuffer();
            try {
                while ((line = br.readLine()) != null) {
                    strb.append(line + "\n");
                    String[] str = line.split(",");
                    String sql = "insert into list values('" + str[0] + "','" + str[1] + "','" + str[2] + "','" + str[3] + "','" + str[4] + "','" + str[5] + "')";
                    try {

                        st = (Statement) conn.createStatement();//创建一个 Statement 对象来将SQL 语句发送到数据库
                        st.executeUpdate(sql);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static String selectByPhoneNumber(String number) throws SQLException {
        Connection conn=JDBC.getConnection();
        String s=null;
        String sql="select * from list where number=?";
        PreparedStatement st= (PreparedStatement) conn.prepareStatement(sql);
        st.setString(1,number);
        ResultSet rs=st.executeQuery();
        if (rs.next()){
            rs.previous();//回滚上一条
            while (rs.next()) {
//            Person p =new Person();
//            p.setId(rs.getInt("id"));
//            p.setName(rs.getString("name"));
//            p.setNumber(rs.getString("number"));
//            String s=p
                s = rs.getInt("id") + "," + rs.getString("name") + "," + rs.getString("number") + "," + rs.getString("addr") + "," + rs.getString("email") + "," + rs.getString("birt");
            }
        }else{
            s="0";//先s定义为0
        }
        return  s;
    }
}
