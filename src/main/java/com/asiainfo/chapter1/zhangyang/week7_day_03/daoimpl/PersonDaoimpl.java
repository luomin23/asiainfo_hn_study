package com.asiainfo.chapter1.zhangyang.week7_day_03.daoimpl;

import com.asiainfo.chapter1.zhangyang.week7_day_03.dao.PersonDao;
import com.asiainfo.chapter1.zhangyang.week7_day_03.entity.Person;
import com.asiainfo.chapter1.zhangyang.week7_day_03.jdbc.JDBCUtil;

import java.sql.*;

/**
 * Created by 11 on 2017/8/23.
 */
public class PersonDaoimpl implements PersonDao {
    @Override
    public void insertUser(Person person) {
        JDBCUtil db = new JDBCUtil();
        Statement sta = null;
        Connection conn = null;
        try {
            conn = db.getConnection();
            sta = conn.createStatement();
            String sql = "INSERT INTO user (username,password,sex) VALUES ('"+person.getUserName()+"','"+person.getUserPassword()+"','"+person.getUserSex()+"')";
            sta.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            db.release(conn,null,null);
        }
    }

    @Override
    public Person selectPersonByUsername(String name) {
        Person p=new Person();
        p.setUserName("");
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        String sql="select * from user where username=?";
        try {
            conn=JDBCUtil.getConnection();
            pst=conn.prepareStatement(sql);
            pst.setString(1,name);
            rs=pst.executeQuery();
            while (rs.next()){
                p.setUserName(rs.getString("username"));
                p.setUserPassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public boolean checkPerson(Person p) {
        String name=p.getUserName();
        Person person=selectPersonByUsername(name);
        if(person.getUserName().equals("")){
            return false;
        }

        if(person.getUserPassword().equals(p.getUserPassword())){
            return true;
        }
        return false;
    }
}
