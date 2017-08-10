package com.asiainfo.chapter1.dongwenchao.day15;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by 超超 on 2017/8/5 0005.
 */
public class demo4 {
    public void update(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/day15","root","root");
            System.out.println("请输入要修改的学号的数据：");
            Scanner input = new Scanner(System.in);
            int id = input.nextInt();
            System.out.println("输入修改信息：");
            String Name=input.next();
            String  Sex=input.next();
            String Age=input.next();
            String sql="update students set Name=?,Sex=?,Age=? where id="+id;
            PreparedStatement stmt=conn.prepareStatement(sql);
            stmt.setString(1,Name);
            stmt.setString(2,Sex);
            stmt.setString(3,Age);
            int count=stmt.executeUpdate();
            System.out.println("修改成功");
        } catch (ClassNotFoundException e) {
            System.out.println("运行时异常，加载时找不到类的路径");
        } catch (SQLException e) {
            System.out.print("数据库异常");
        }
    }
    public static void main(String[]args){
        demo4 a=new demo4();
        a.update();
    }
}
