package com.asiainfo.chapter1.liuwy.August04;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by LENOVO on 2017/8/4.
 */
public class DeptBIZ {
    public boolean save(Dept dept){
        DeptDao deptDao=new DeptDao();
        try {
            deptDao.save(dept);
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally {
            DBUtils.closeConnection();
        }
    }
    public Dept findById(int deptno){
        DeptDao deptDao=new DeptDao();
        try {
            return deptDao.findById(deptno);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            DBUtils.closeConnection();
        }

    }
    public List<Dept> findAll(){
        DeptDao deptDao=new DeptDao();
        try {
            return deptDao.findAll();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            DBUtils.closeConnection();
        }
    }
}
