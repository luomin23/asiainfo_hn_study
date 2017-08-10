package com.asiainfo.chapter1.dongwenchao.day15;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by 超超 on 2017/8/5 0005.
 */
public class demo3 {
    public void select() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/day15","root","root");
            System.out.println("请输入插入的数据：");
            Scanner input = new Scanner(System.in);
            int id = input.nextInt();
            String Name=input.next();
            String  Sex=input.next();
            String Age=input.next();
            String sql="insert into students values (?,?,?,?)";
            /*Statement stmt=conn.createStatement(sql);*/
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.setString(2,Name);
            stmt.setString(3,Sex);
            stmt.setString(4,Age);
            int count=stmt.executeUpdate();
            System.out.println("插入"+count+"数据");
        } catch (ClassNotFoundException e) {
            System.out.println("运行时异常，加载时找不到类的路径");
        } catch (SQLException e) {
            System.out.print("数据库异常");
        }
    }
    public static void main(String[]args){
        demo3 a=new demo3();
        a.select();
    }
}
