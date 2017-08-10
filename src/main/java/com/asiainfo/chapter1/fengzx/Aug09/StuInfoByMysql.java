package com.asiainfo.chapter1.fengzx.Aug09;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by fengzx on 2017/8/9.
 */
public class StuInfoByMysql extends JFrame {
    Object data[][];
    Object colname[] = {"学号","姓名","年龄","专业"};
    JTable studentTable;
    StuInfoByMysql(){
        super("MySQLJDBC");
        initView();
    }

    private void initView(){
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        data = new Object[10][10];
        this.loadData();
        studentTable = new JTable(data,colname);
        c.add(new JScrollPane(studentTable),BorderLayout.CENTER);
    }

    private void loadData(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            Statement stmt = conn.createStatement();
            String sql = "select * from stdent";
            ResultSet rs = stmt.executeQuery(sql);
            int i = 0;
            while (rs.next()){
                data[i][0] = rs.getString(1);
                data[i][1] = rs.getString(2);
                data[i][2] = rs.getInt(3);
                data[i][3] = rs.getString(4);
                i ++;
            }
            rs.close();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StuInfoByMysql app = new StuInfoByMysql();
        app.setSize(550,250);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
