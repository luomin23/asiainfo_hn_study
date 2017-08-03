package com.asiainfo.chapter1.wangjz.java.javaday1.javaday8;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

/**
 * Created by wjz123456 on 2017/8/3.
 */
public class StudentByMysql extends JFrame {
    Object data[][];
    Object colname[]={"学好","姓名","年龄","专业","爱好"};
    JTable studentTable;
    StudentByMysql(){
        super("MYSQL的ＪＤＢＣ访问数据库");
        initView();
    }

    private void initView() {
        Container c=getContentPane();
        c.setLayout(new BorderLayout());
        data=new Object[10][10];
        this.loadData();
        studentTable=new JTable(data,colname);
        c.add(new JScrollPane(studentTable),BorderLayout.CENTER);

    }
    private void loadData(){
try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123456");
    Statement stmt=conn.createStatement();
    String sql1="insert into studentinfo values(3,'ww',5,6)";
    String sql="select * from studentinfo";
    boolean resultSet=stmt.execute(sql1);
    ResultSet rs=stmt.executeQuery(sql);
    int i=0;
    while(rs.next()){
        data[i][0]=rs.getString(1);
        data[i][1]=rs.getString(2);
        data[i][2]=rs.getString(3);
        data[i][3]=rs.getString(4);
      i++;
    }
    rs.close();
    conn.close();
} catch (Exception e) {
    e.printStackTrace();
}
    }

    public static void main(String[] args) {
        StudentByMysql app=new StudentByMysql();
        app.setSize(550,250);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
