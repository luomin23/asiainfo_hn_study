package com.asiainfo.chapter1.dongwenchao.paging;

import com.asiainfo.chapter1.dongwenchao.day10.JDBC;
import java.sql.*;
/**
 * Created by 超超 on 2017/8/11 0011.
 */
public class Realpaged {
    JDBC connect=new JDBC();
    Connection conn=null;
    public void real(){
        conn=connect.getConn();
        String sql="SELECT * FROM students";
        try {
            PreparedStatement stmt=conn.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            while (rs.next()){
                System.out.println("编号："+rs.getString(1)+"\t"+"姓名："+rs.getString(2)+"\t"+"\t"+"性别："+rs.getString(3)+"\t"+"电话："+rs.getString(4)+"\t");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Realpaged a=new Realpaged();
        a.real();
    }
}
