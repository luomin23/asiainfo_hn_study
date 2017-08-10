package com.asiainfo.chapter1.dongwenchao.day10;
import java.sql.*;
/**
 * Created by 超超 on 2017/8/4 0004.
 */
public class demoDao {
    public void   find(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/chao","root","root");
            String sql="SELECT * FROM login";
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()){
                int user=rs.getInt("userName");
                String pass=rs.getString("password");
                /*String sex=rs.getString("Sex");
                String age=rs.getString("Age");*/
                System.out.println(user+":"+pass);
            }
        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String []args){
        demoDao a=new demoDao();
        a.find();
    }
}
