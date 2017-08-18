package com.asiainfo.chapter1.zhangyang.week6_day_05.dao;

import com.asiainfo.chapter1.dongwenchao.web.Login;
import com.asiainfo.chapter1.zhangyang.week6_day_05.jdbc.DB;
import com.asiainfo.chapter1.zhangyang.week6_day_05.entity.Person;
import com.mysql.jdbc.*;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * Created by 11 on 2017/8/18.
 */
public class PersonDao {
    public void insertUser(Person person){
        DB db = new DB();
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
            db.close(conn);
        }
    }
    public Person selectPersonByUsername(String name){
        Person p=new Person();
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        String sql="select * from user where username=?";
        try {
            conn=DB.getConnection();
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
    public boolean checkPerson(Person p){
        String name=p.getUserName();

        Person person=selectPersonByUsername(name);
        if(person.getUserPassword().equals(p.getUserPassword())){
            return true;
        }
        return false;
    }

}

