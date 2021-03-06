package com.asiainfo.chapter1.hanjunwen.webDemo.loginDemo.dao.dao.impl;


import com.asiainfo.chapter1.hanjunwen.webDemo.loginDemo.dao.OperationUser;
import com.asiainfo.chapter1.hanjunwen.webDemo.loginDemo.entity.User;
import com.asiainfo.chapter1.hanjunwen.webDemo.loginDemo.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperationUserImpl implements OperationUser {

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
}
