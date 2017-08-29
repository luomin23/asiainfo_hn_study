package com.asiainfo.chapter1.zhangyang.week7_day_03.daoimpl;

import com.asiainfo.chapter1.zhangyang.week7_day_03.jdbc.JDBCUtil;
import com.asiainfo.chapter1.zhangyang.week7_day_03.dao.StudentDao;
import com.asiainfo.chapter1.zhangyang.week7_day_03.entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 11 on 2017/8/23.
 */
public class StudentDaoimpl implements StudentDao {
    int pagesize=5;
    @Override
    public void insertStudent(Student student) {
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
    @Override
    public List<Student> getAllStudent(int currentpageno) {
        List<Student> list = new ArrayList<Student>();
        Connection conn = JDBCUtil.getConnection();
        PreparedStatement ps = null;
        int BeginRecord=(currentpageno-1)*pagesize;
        int EndRecord = pagesize;
        String sql="select * from student limit ?,?";
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,BeginRecord);
            ps.setInt(2,EndRecord);
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
    @Override
    public int getPageCount() {
        int total = 0;
        int PageCount = 0;
        Connection conn = null;
        PreparedStatement ps =null;
        ResultSet rs = null;
        String sql = "select count(*) from student";

        try {
            conn=JDBCUtil.getConnection();
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
           while (rs.next()){
                total = rs.getInt(1);
                PageCount = (total-1)/pagesize+1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return PageCount;
    }

    @Override
    public Student getStudent(String sno) {
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

    @Override
    public List<Student> queryStudent(String name) {
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
    @Override
    public void delete(String sno) {
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

    @Override
    public void update(Student student) {
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
