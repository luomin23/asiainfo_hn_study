package com.asiainfo.chapter1.zhangyang.week7_day_01.dao;

import com.asiainfo.chapter1.zhangyang.week7_day_01.JDBC.JDBCUtil;
import com.asiainfo.chapter1.zhangyang.week7_day_01.entity.Student;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 11 on 2017/8/21.
 */
public class StudentDao {
    public void insertStudent(Student student){
        Connection conn = JDBCUtil.getConnection();
        PreparedStatement ps = null;
        String sql="insert into student values(?,?,?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,student.getSno());
            ps.setString(2,student.getSname());
            if(student.getBirthday()!=null){
                ps.setDate(3, new java.sql.Date(student.getBirthday().getTime()));
            }else{
                ps.setDate(3, null);
            }
            ps.setString(4,student.getMajor());
            ps.setInt(5,student.getAge());
            ps.setInt(6,student.getGender());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(conn,ps,null);
        }
    }
    public List<Student> getAllStudent(){
        List<Student> list = new ArrayList<Student>();
        Connection conn = JDBCUtil.getConnection();
        PreparedStatement ps = null;
        String sql = "select*from student";
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                list.add(new Student(rs.getString("sno"),rs.getString("sname"),rs.getDate("birthday")
                ,rs.getString("major"),rs.getInt("age"),rs.getInt("gender")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(conn,ps,rs);
        }
        return list;
    }
    public Student getStudent(String sno){
        Connection conn =JDBCUtil.getConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql="select*from student where sno = ?";
        try {
            ps=conn.prepareStatement(sql);
            ps.setString(1, sno);
            rs = ps.executeQuery();
            while(rs.next()){
                return new Student(rs.getString("sno"),rs.getString("sname"),
                        rs.getDate("birthday"),rs.getString("major"),
                        rs.getInt("age"),rs.getInt("gender"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            JDBCUtil.release(conn, ps, rs);
        }
        return null;
    }
    public List<Student> queryStudent(String name){
        Connection conn =JDBCUtil.getConnection();
        List<Student> list = new ArrayList<Student>();
        String sql="select*from student where sname like ?";
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            ps=conn.prepareStatement(sql);
            ps.setString(1,"%"+name+"%" );
            rs=ps.executeQuery();
            while(rs.next()){
                list.add(new Student(rs.getString("sno"),rs.getString("sname"),
                        rs.getDate("birthday"),rs.getString("major"),
                        rs.getInt("age"),rs.getInt("gender")));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            JDBCUtil.release(conn, ps, rs);
        }
        return list;
    }
    public void delete(String sno){
        Connection conn =JDBCUtil.getConnection();
        PreparedStatement ps=null;
        String sql="delete from student where sno = ?";
        try {
            ps=conn.prepareStatement(sql);
            ps.setString(1, sno);
            ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            JDBCUtil.release(conn, ps, null);
        }
    }
    public void update(Student student){
        Connection conn =JDBCUtil.getConnection();
        PreparedStatement ps=null;
        String sql="update student set sname = ?,birthday = ?,major = ?,age = ?,gender = ? where sno = ?";
        try {
            ps=conn.prepareStatement(sql);
            ps.setString(1, student.getSname());
            if(student.getBirthday()!=null){
                ps.setDate(2, new java.sql.Date(student.getBirthday().getTime()));
            }else{
                ps.setDate(2, null);
            }
            ps.setString(3, student.getMajor());
            ps.setInt(4, student.getAge());
            ps.setInt(5, student.getGender());
            ps.setString(6, student.getSno());
            ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            JDBCUtil.release(conn, ps, null);
        }
    }
}
