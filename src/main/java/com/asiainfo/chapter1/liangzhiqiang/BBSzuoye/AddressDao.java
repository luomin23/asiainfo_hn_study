package com.asiainfo.chapter1.liangzhiqiang.BBSzuoye;

/**
 * Created by 君不悔 on 2017/8/23.
 */
import java.sql.*;
import java.util.*;



public class AddressDao{
    public void add(Address address){
        try{
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("insert into address (name,street,city,state,zip) values (?,?,?,?,?)");
            pstmt.setString(1,address.getName());
            pstmt.setString(2,address.getStreet());
            pstmt.setString(3,address.getCity());
            pstmt.setString(4,address.getState());
            pstmt.setString(5,address.getZip());
            pstmt.executeUpdate();
            JdbcUtil.close(pstmt,conn);
        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public void delete(int id){
        try{
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("delete from address where id =?");
            pstmt.setInt(1,id);
            pstmt.executeUpdate();
            JdbcUtil.close(pstmt,conn);
        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public void update(Address address){
        try{
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("update address set name=?,street=?,city=?,state=?,zip=? where id=?");
            pstmt.setString(1,address.getName());
            pstmt.setString(2,address.getStreet());
            pstmt.setString(3,address.getCity());
            pstmt.setString(4,address.getState());
            pstmt.setString(5,address.getZip());
            pstmt.setInt(6,address.getId());
            pstmt.executeUpdate();
            JdbcUtil.close(pstmt,conn);
        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public List<Address> findAll(){
        List<Address> list = new ArrayList<Address>();
        try{
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select * from address");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                Address address = new Address();
                address.setId(rs.getInt(1));
                address.setName(rs.getString(2));
                address.setStreet(rs.getString(3));
                address.setCity(rs.getString(4));
                address.setState(rs.getString(5));
                address.setZip(rs.getString(6));
                list.add(address);
            }

            JdbcUtil.close(pstmt,conn);
        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return list;
    }

    public Address findById(int id){
        Address address = new Address();
        try{
            Connection conn = JdbcUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select * from address where id=?");
            pstmt.setInt(1,id);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                address.setId(rs.getInt(1));
                address.setName(rs.getString(2));
                address.setStreet(rs.getString(3));
                address.setCity(rs.getString(4));
                address.setState(rs.getString(5));
                address.setZip(rs.getString(6));
            }

            JdbcUtil.close(pstmt,conn);
        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return address;
    }
}