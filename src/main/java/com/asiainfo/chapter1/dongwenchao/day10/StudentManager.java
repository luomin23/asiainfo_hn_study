package com.asiainfo.chapter1.dongwenchao.day10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * Created by 超超 on 2017/8/3 0003.
 */
public class StudentManager extends JFrame implements ActionListener{
    JTabbedPane dbTabPane;//定义选项卡窗格对象
    jiben inputInnerPanel;//定义录入面板对象
    JButton inputBtn;
    Connection conn;
    Statement stmt;
    public StudentManager(){
        super("学生基本信息");
        setGUIComponent();
    }
    public void setGUIComponent(){
        Container c=getContentPane();
        c.setLayout(new BorderLayout());
        dbTabPane=new JTabbedPane();//创建选项卡窗格对象
        //录入面板
        inputInnerPanel=new jiben();
        inputBtn=new JButton("录入");
        inputBtn.addActionListener(this);
        dbTabPane.add("录入记录",inputInnerPanel);
        c.add(BorderLayout.CENTER,dbTabPane);
        c.add(BorderLayout.SOUTH,inputBtn);
    }
    public void connection(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        //建立和数据库的连接
         conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
        stmt=conn.createStatement();
        }catch (ClassNotFoundException e){
            System.out.println("驱动程序装载失败");
        }catch(SQLException e2){
            System.out.println("驱动程序装载失败1");
            e2.getMessage();
        }
    }
    public void close(){
        try{
            if (stmt!=null)
                stmt.close();
            if (conn!=null)
                conn.close();
        }catch (SQLException e2){
            System.out.println("不能正常关闭");
        }
    }
    public void inputRecords(){
        String no=inputInnerPanel.getNo();
        String name=inputInnerPanel.getName();
        String gender=inputInnerPanel.getGender();
        String birth=inputInnerPanel.getBirth();
        String address=inputInnerPanel.getAddress();
        String tel=inputInnerPanel.getTel();
        try{
            connection();
            String sql;
            sql="INSERT INTO student(学号,姓名,性别,出生年月,家庭住址,联系电话)"+"values("+"'"+no+"',"+"'"+name+"',"+"'"+gender+"',"+"'"+birth+"',"+"'"+address+"',"+"'"+tel+"')";
            stmt.execute(sql);
            System.out.print("插入成功");
        }catch (SQLException e1){
            System.err.println("插入失败");
        }finally {
            close();
        }

    }
      @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()== inputBtn) {
             inputRecords();
         }
     }
    public static void main(String[]args){
        StudentManager app=new StudentManager();
        app.setSize(550,200);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
