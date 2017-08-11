package com.asiainfo.chapter1.zhangle.MailWorks;


import com.alibaba.fastjson.JSONArray;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by del on 2017/8/9.
 */
public class DatebaseWorks {
    static MailArray ma=new MailArray();


    /*查询操作*/
    public Mail select(String telephone) throws Exception{
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Mail mail=null;
        try {
            conn=JDBC.getConnection();
            String sql="select * from Mail where telephone=?";
            ps=conn.prepareStatement(sql);  //设置sql语句
            ps.setString(1,telephone);
            rs=ps.executeQuery();
            if(rs.next()){
                mail=new Mail();
                mail.setId(rs.getInt(1));
                mail.setName(rs.getString(2));
                mail.setTelephone(rs.getString(3));
            }
        }finally{
            JDBC.close(rs,ps,conn);

        }
        return mail;
    }

    public static Mail insert(JSONArray arrays){
        arrays=ma.arrays();
        Mail mail=null;
        Connection conn;
        PreparedStatement ps=null;
        try {
            conn=JDBC.getConnection();
            String sql="insert into Mail values(?)";
            ps=conn.prepareStatement(sql);
            ps.setString(1, String.valueOf(arrays));


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return mail;

    }

    public static void main(String[] args) {


        DatebaseWorks ds = new DatebaseWorks();
        Scanner sc = new Scanner(System.in);
        System.out.print("telephone:");
        String telephone = sc.next();
        Mail m;
        try {
             m= ds.select(telephone);

            if (m != null) {
                System.out.println(m.toString());
            } else {
                System.out.print("error:");
            }
        } catch (Exception e) {
            System.out.println("noMethod");
        }

    }

}
