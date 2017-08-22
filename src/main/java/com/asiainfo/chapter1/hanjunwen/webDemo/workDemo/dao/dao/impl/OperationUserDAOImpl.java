package com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.dao.dao.impl;

import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.dao.OperationUserDAO;
import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.entity.User;
import com.asiainfo.chapter1.hanjunwen.webDemo.workDemo.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperationUserDAOImpl implements OperationUserDAO {

    @Override
    //根据用户名查找用户
    public User selectUserByUsername(String name) {
        Connection conn = JdbcUtil.getConnection();
        User u=new User();
        String sql="select * from user where username=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,name);
            ResultSet rs=pst.executeQuery();
            if(rs.next()) {
                rs.previous();
                while (rs.next()) {
                    u.setUserName(rs.getString("username"));
                    u.setPwd(rs.getString("pwd"));
                }
            }else {
                u.setUserName("");
                u.setPwd("");
            }
            pst.close();
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JdbcUtil.closeConnection(conn);
        return u;
    }

    @Override
    public Boolean checkUser(User user) {
       User u=selectUserByUsername(user.getUserName());
       if(u==null&&u.equals("")){
//           result="用户不存在！";
           return false;
       }
       if(u.getPwd().equals(user.getPwd())){
           return true;
       }else {
//           result="密码错误！！";
           return false;
       }
    }

    @Override
    public Boolean updateUserOfPwd(User user) {
        Connection conn = JdbcUtil.getConnection();
//        User u =selectUserByUsername(user.getUserName());//根据传过来的对象拿到该对象的用户名，然后根据该用户名从数据库中取得对象
       PreparedStatement pst=null;
        String sql="update user set pwd=?";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1,user.getPwd());
            pst.executeUpdate();
            pst.close();
            JdbcUtil.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            System.out.println("数据库出现异常！");
            e.printStackTrace();
        }
        return false;
    }
}
