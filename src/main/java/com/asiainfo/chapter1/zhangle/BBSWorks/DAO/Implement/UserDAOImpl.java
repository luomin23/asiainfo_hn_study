package com.asiainfo.chapter1.zhangle.BBSWorks.DAO.Implement;

import com.asiainfo.chapter1.zhangle.BBSWorks.DAO.UserDAO;
import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.Comment;
import com.asiainfo.chapter1.zhangle.BBSWorks.Entity.User;
import com.asiainfo.chapter1.zhangle.BBSWorks.JDBCUtil.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by del on 2017/8/21.
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public User selectByTell(String telephone) {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        User users=null;
        try {
            conn=JDBC.getConnection();
            String sql="select name,telephone,email from bbsuser where telephone=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,telephone);
            rs=ps.executeQuery();
            while(rs.next()){
                users=new User();
                users.setName(rs.getString(1));
                users.setTelephone(rs.getString(2));
                users.setEmail(rs.getString(3));
            }

        } catch (ClassNotFoundException e) {
            System.out.println("未找到JDBC");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBC.close(conn,ps,rs);
        }

        return users;
    }

    @Override
    public List<User> selectAll() {

        return null;
    }

    @Override
    public void insertUser(User user) {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn= JDBC.getConnection();
            String sql="insert into bbsuser values(null,?,?,null)";
            ps=conn.prepareStatement(sql);
            ps.setString(1,user.getTelephone());
            ps.setString(2,user.getPassword());
            ps.executeUpdate();

        } catch (ClassNotFoundException e) {
            System.out.println("未找到JDBC");
        } catch (SQLException e) {
            System.out.println("连接数据库异常");
        }finally {
            JDBC.close(conn,ps);
        }

    }

    @Override
    public void modityUser( String name,String email,String tele ) {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn=JDBC.getConnection();
            String sql="UPDATE bbsuser set name=?,email=? where telephone=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,email);
            ps.setString(3,tele);
            int i=ps.executeUpdate();
            System.out.println("修改成功");

        } catch (ClassNotFoundException e) {
            System.out.println("未找到JDBC");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBC.close(conn,ps);
        }

    }


}
