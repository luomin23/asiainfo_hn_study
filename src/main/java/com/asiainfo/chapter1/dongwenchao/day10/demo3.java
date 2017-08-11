package com.asiainfo.chapter1.dongwenchao.day10;

import java.sql.*;

/**
 * Created by 超超 on 2017/8/4 0004.
 */
public class demo3 {
    JDBC onecon =new JDBC();
    Connection con=null;//保存数据库连接的成员变量
    private Statement stmt=null;
    private PreparedStatement pstmt=null;
    //通过给定的学号查询
    public void getOne(String Id){
        con=onecon.getConn();
        ResultSet rs;
        try{
            pstmt=con.prepareStatement( " SELECT * FROM students WHERE Id=? ");
            pstmt.setString(1,Id);
            rs=pstmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t");
            }
            pstmt.close();
            con.close();
        }catch (SQLException e){
            System.out.println("数据库异常" +e);
        }
    }
    public void getAll(){
        con=onecon.getConn();
        ResultSet rs;
        try
        {
            stmt =con.createStatement();
            rs=stmt.executeQuery("SELECT * FROM students");
            while (rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t");
            }
            stmt.close();
            con.close();
        }catch (SQLException e1){
            System.out.println("数据库异常" +e1);
        }
    }
    public static void main(String []args){
        demo3 q=new demo3();
        q.getAll();
        q.getOne("1");
    }
}
