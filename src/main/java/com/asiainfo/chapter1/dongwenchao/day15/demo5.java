package com.asiainfo.chapter1.dongwenchao.day15;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by 超超 on 2017/8/5 0005.
 */
public class demo5 {
    public void delect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day15", "root", "root");
            System.out.println("请输入要删除的学号：");
            Scanner input = new Scanner(System.in);
            String Id = input.next();
            String sql="DELETE FROM students WHERE Id="+Id;
            PreparedStatement stmt=conn.prepareStatement(sql);
            /*Statement stmt = conn.createStatement();*/
            stmt.executeUpdate();
            System.out.println("删除成功！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        demo5 a=new demo5();
        a.delect();
    }
}
