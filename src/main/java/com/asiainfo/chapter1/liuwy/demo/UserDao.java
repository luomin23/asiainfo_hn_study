package com.asiainfo.chapter1.liuwy.demo;

import com.asiainfo.chapter1.liuwy.zuoye.DBUtils;
import com.asiainfo.chapter1.liuwy.zuoye.Person;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LENOVO on 2017/8/23.
 */
public class UserDao {
    public void save(User user ) throws ClassNotFoundException,SQLException,IOException {
        String sql="insert into message(name,age,address,emil) values(?,?,?,?)";

        Connection conn= DBUtils.getConnection();
        PreparedStatement pstat=conn.prepareStatement(sql);
        pstat.setString(1,user.getName());
        pstat.setInt(2,user.getAge());
        pstat.setString(3,user.getAddress());
        pstat.setString(4,user.getEmil());
        pstat.executeUpdate();

        String sql1="insert into user(name,password) values(?,?)";
        PreparedStatement pstat1=conn.prepareStatement(sql1);
        pstat1.setString(1,user.getName());
        pstat1.setString(2,user.getPassword());
        pstat1.executeUpdate();
    }
    //查找
    public  User findById(int id) throws ClassNotFoundException, SQLException{
        String sql="select * from message where id=?";
        Connection conn= DBUtils.getConnection();
        PreparedStatement pstat=conn.prepareStatement(sql);
        pstat.setInt(1,id);
        ResultSet rs=pstat.executeQuery();
        if(rs.next()){
            User user=new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getInt("age"));
            user.setAddress(rs.getString("address"));
            user.setEmil(rs.getString("emil"));
            return user;
        }
        else {
            return null;}
    }
    //删除
    public void delete(int id) throws ClassNotFoundException, SQLException{
        String sql="delete from message where id=?";
        Connection conn= DBUtils.getConnection();
        PreparedStatement pstat=conn.prepareStatement(sql);
        pstat.setInt(1,id);
        pstat.executeUpdate();
    }

    //修改
    public void update(User user) throws ClassNotFoundException, SQLException{
        String sql="UPDATE message set name=?,age=?,address=?,emil=? WHERE id=?";
        Connection conn= DBUtils.getConnection();
        PreparedStatement pstat=conn.prepareStatement(sql);
        pstat.setString(1,user.getName());
        pstat.setInt(2,user.getAge());
        pstat.setString(3,user.getAddress());
        pstat.setString(4,user.getEmil());
        pstat.setInt(5,user.getId());

        pstat.executeUpdate();
    }
    //登录查询
    public  User findByName(String name) throws ClassNotFoundException, SQLException{
        String sql="select * from user where name=?";
        Connection conn= DBUtils.getConnection();
        PreparedStatement pstat=conn.prepareStatement(sql);
        pstat.setString(1,name);
        ResultSet rs=pstat.executeQuery();
        if(rs.next()){
            User user=new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            return user;
        }
        else {
            return null;}
    }

    //查找所有用户信息
    public List<User> findAll() throws ClassNotFoundException,SQLException{
        List<User> goodList=new ArrayList<User>();
        String sql="select * from message ORDER BY id ASC ";
        Connection conn= DBUtils.getConnection();
        PreparedStatement pstat=conn.prepareStatement(sql);
        ResultSet rs=pstat.executeQuery();
        while (rs.next()){
            User user=new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getInt("age"));
            user.setAddress(rs.getString("address"));
            user.setEmil(rs.getString("emil"));

        }
        return goodList;
    }
    //分页查询
    public  List<User> findByPage(PageVO<User> pageVO) throws ClassNotFoundException, SQLException{
        List<User> userList=new ArrayList<User>();
        String sql="select * from message ORDER BY id ASC limit ?,?";
        Connection conn= DBUtils.getConnection();
        PreparedStatement pstat=conn.prepareStatement(sql);
        pstat.setInt(1,(pageVO.getPage()-1)*pageVO.getRecordOfPage());
        pstat.setInt(2,pageVO.getRecordOfPage());
        ResultSet rs=pstat.executeQuery();
        while (rs.next()){
            User user=new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getInt("age"));
            user.setAddress(rs.getString("address"));
            user.setEmil(rs.getString("emil"));
            userList.add(user);

        }return userList;

    }
    public  int findCount() throws ClassNotFoundException, SQLException{
        String sql="select COUNT(*) from message ";
        Connection conn= DBUtils.getConnection();
        PreparedStatement pstat=conn.prepareStatement(sql);
        ResultSet rs=pstat.executeQuery();
        rs.next();
            return rs.getInt(1);

    }

}
