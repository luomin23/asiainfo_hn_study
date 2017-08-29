package com.asiainfo.chapter1.liuwy.demo;

import com.asiainfo.chapter1.liuwy.August08.PersonDao;
import com.asiainfo.chapter1.liuwy.zuoye.DBUtils;
import com.asiainfo.chapter1.liuwy.zuoye.Person;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by LENOVO on 2017/8/23.
 */
public class UserBIZ {
    public boolean save(User user){
        UserDao userDao=new UserDao();
        try {
            try {
                userDao.save(user);
            } catch (IOException e) {
                e.printStackTrace();
            }
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

    public User findById(int id){
        UserDao userDao=new UserDao();
        try {
            return userDao.findById(id);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            DBUtils.closeConnection();
        }
    }

    //删除
    public boolean delete(int id){
        UserDao userDao=new UserDao();
        try {
            userDao.delete(id);
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
    public boolean update(User user){
        UserDao userDao=new UserDao();
        try {
            userDao.update(user);
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            DBUtils.closeConnection();
        }
    }
    public User findByName(String name){
        UserDao userDao=new UserDao();
        try {
            return userDao.findByName(name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            DBUtils.closeConnection();
        }
    }
    private UserDao userDao=new UserDao();
    public PageVO<User> findByPage(PageVO<User> pageVO){

        try {
            List<User> userList=this.userDao.findByPage(pageVO);
            pageVO.setListOfPage(userList);
            return pageVO;
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
    public int findCount(){
        try {
            return this.userDao.findCount();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return -1;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        } finally {
            DBUtils.closeConnection();
        }
    }
}
