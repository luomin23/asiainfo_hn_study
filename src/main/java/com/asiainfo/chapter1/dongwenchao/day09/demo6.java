package com.asiainfo.chapter1.dongwenchao.day09;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by 超超 on 2017/8/3 0003.
 */
public class demo6 extends JFrame{
    Object data[][];
    Object colname[]={"学号","姓名","年龄","专业"};
    JTable a;
    demo6(){
        super("连接数据库");
        initView();
    }
    private void initView() {
        Container c=getContentPane();
        c.setLayout(new BorderLayout());
        data=new Object[10][10];
        this.loadData();
        a=new JTable(data,colname);
        c.add(new JScrollPane(a),BorderLayout.CENTER);
    }
    private void loadData() {
        try{
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //建立和数据库的连接
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/stu","root","root");
            Statement stmt=conn.createStatement();
            String sql="select * from emp";
            ResultSet rs=stmt.executeQuery(sql);
            int i=0;
            while (rs.next()){
                data[i][0]=rs.getString(1);
                data[i][1]=rs.getString(2);
                data[i][2]=rs.getString(3);
                data[i][3]=rs.getString(4);
                i++;
            }
            rs.close();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        demo6 b=new demo6();
        b.setSize(550,250);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setVisible(true);
    }
}
