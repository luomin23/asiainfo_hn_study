package com.asiainfo.chapter1.liuwy.demo;

import com.asiainfo.chapter1.liuwy.zuoye.DBUtils;
import org.apache.commons.fileupload.util.LimitedInputStream;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by LENOVO on 2017/8/23.
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
//        UserBIZ userDao=new UserBIZ();
//
//            User user=userDao.findByName("刘文燕");
//            System.out.print(user.getId());
//        String sql="select * from message ORDER BY id ASC limit ?,?";
//        Connection conn= DBUtils.getConnection();
//        PreparedStatement pstat=conn.prepareStatement(sql);
//        pstat.setInt(1,0);
//        pstat.setInt(2,1);
//        ResultSet rs=pstat.executeQuery();
//        while (rs.next()){
//            System.out.println(rs.getInt("id")+" "+rs.getString("name"));
//
//
//        }

//        UserBIZ userBIZ=new UserBIZ();
//        PageVO<User> pageVO=new PageVO<User>();
//        pageVO.setRecordOfPage(3);
//        pageVO.setPage(1);
//        pageVO=userBIZ.findByPage(pageVO);
//        List<User> userList=pageVO.getListOfPage();
//        for (User user:userList) {
//            System.out.println(user.getId()+" "+user.getName());
//
//        }
        UserDao userDao=new UserDao();
        System.out.println(userDao.findCount());





    }
}
