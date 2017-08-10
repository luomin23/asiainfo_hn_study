package com.asiainfo.chapter1.liuwy.August08;



import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by LENOVO on 2017/8/8.
 */
public class PersonDao {


    //保存
    public void save(Person person) throws ClassNotFoundException,SQLException,IOException {
        String sql="insert into person(name,phonenumber,address,emil,birth) values(?,?,?,?,?)";
        //String sql="insert into dept(deptno,name,loc) values(?,?,?)";
        Connection conn=DBUtils.getConnection();
        PreparedStatement pstat=conn.prepareStatement(sql);
        pstat.setString(1,person.getName());
        pstat.setInt(2,person.getPhonenumber());
        pstat.setString(3,person.getAddress());
        pstat.setString(4,person.getEmil());
        pstat.setInt(5,person.getBirth());
        pstat.executeUpdate();
    }
//查找
    public Person findByPhone(int phonenumber) throws ClassNotFoundException, SQLException{
        String sql="select * from person where phonenumber=?";
        Connection conn= DBUtils.getConnection();
        PreparedStatement pstat=conn.prepareStatement(sql);
        pstat.setInt(1,phonenumber);
        ResultSet rs=pstat.executeQuery();
        if(rs.next()){
            Person person1=new Person();
            person1.setId(rs.getInt("id"));
            person1.setName(rs.getString("name"));
            person1.setPhonenumber(rs.getInt("phonenumber"));
            person1.setAddress(rs.getString("address"));
            person1.setEmil(rs.getString("emil"));
            person1.setBirth(rs.getInt("birth"));
            return person1;
        }else {
            return null;}
    }

}
