package com.asiainfo.chapter1.zhangle.August4th;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by del on 2017/8/4.
 */
public class RolesJava {

    /*添加操作*/
    public static void add(Roles roles){
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn=JDBC.getConnection();
            String sql="insert into Roles values(?,?,?)";
            ps=conn.prepareStatement(sql);
            ps.setInt(1,roles.getId());
            ps.setString(2,roles.getName());
            ps.setInt(3,roles.getPassword());
            ps.executeUpdate();
            System.out.println("添加成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBC.close(ps,conn);
        }

    }

    public static void main(String[] args) {
        Roles roles=new Roles();
        roles.setId(1002);
        roles.setName("z1");
        roles.setPassword(1235);
        add(roles);
    }


}
