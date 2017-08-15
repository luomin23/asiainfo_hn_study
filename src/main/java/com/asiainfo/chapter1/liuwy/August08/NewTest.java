package com.asiainfo.chapter1.liuwy.August08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by LENOVO on 2017/8/8.
 */
public class NewTest {
    public static void main(String[] args)  {
//        Properties properties = new Properties();
//        try {
//            properties.load(NewTest.class.getResourceAsStream("person.properties"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        String person=PropertiesUtil.getProperty("username");
        System.out.println(person);//
//        String sql = "insert into person(name,phonenumber,address,emil,birth) values(?,?,?,?,?)";
//        //String sql="insert into dept(deptno,name,loc) values(?,?,?)";
//        Connection conn = DBUtils.getConnection();
//        PreparedStatement pstat = conn.prepareStatement(sql);
//        pstat.setString(1, person.getName());
//        pstat.setInt(2, person.getPhonenumber());
//        pstat.setString(3, person.getAddress());
//        pstat.setString(4, person.getEmil());
//        pstat.setInt(5, person.getBirth());
//        pstat.executeUpdate();
    }
}