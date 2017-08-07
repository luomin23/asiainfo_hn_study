package com.asiainfo.chapter1.liuwy.August04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LENOVO on 2017/8/4.
 */
public class DeptDao {
    public void save(Dept dept) throws ClassNotFoundException,SQLException{
        //String sql="insert into dept(deptno,name,loc) values(S_DEPT_ID,?,?)";
        String sql="insert into dept(deptno,name,loc) values(?,?,?)";
        Connection conn=DBUtils.getConnection();
        PreparedStatement pstat=conn.prepareStatement(sql);
        pstat.setInt(1,dept.getDeptno());//手动设置主键
        pstat.setString(2,dept.getName());
        pstat.setString(3,dept.getLoc());
        pstat.executeUpdate();
    }
    public void update(Dept dept){}
    public void delete(int deptno){}
    public Dept findById(int deptno) throws ClassNotFoundException, SQLException{
        String sql="select * from dept where deptno=?";
        Connection conn=DBUtils.getConnection();
        PreparedStatement pstat=conn.prepareStatement(sql);
        pstat.setInt(1,deptno);
        ResultSet rs=pstat.executeQuery();
        if(rs.next()){
            Dept dept=new Dept();
            dept.setDeptno(rs.getInt("deptno"));
            dept.setName(rs.getString("name"));
            dept.setLoc(rs.getString("loc"));
            return dept;
        }else {
        return null;}
    }
    public List<Dept> findAll()throws ClassNotFoundException, SQLException{
        List<Dept> deptList=new ArrayList<Dept>();
        String sql="select * from dept";
        Connection conn=DBUtils.getConnection();
        PreparedStatement pstat=conn.prepareStatement(sql);
        ResultSet rs=pstat.executeQuery();
        while (rs.next()){
            Dept dept=new Dept();
            dept.setDeptno(rs.getInt("deptno"));
            dept.setName(rs.getString("name"));
            dept.setLoc(rs.getString("loc"));
            deptList.add(dept);
        }
            return deptList;
    }

}
