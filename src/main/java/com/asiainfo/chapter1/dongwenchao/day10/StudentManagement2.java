package com.asiainfo.chapter1.dongwenchao.day10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * Created by 超超 on 2017/8/5 0005.
 */
public class StudentManagement2 extends JFrame implements ActionListener{
    JTabbedPane dbTabPane;
    JPanel inputP;
    JPanel viewP;
    JPanel updateP;
    JPanel delP;
    JButton inputBtn;
    jiben inputInnerPanel;
    JTextArea viewArea;
    JButton viewBtn;
    jiben updateInnerPanel;
    JLabel updateI;
    JTextField updateIT;
    JButton updateBtn;
    jiben delIP;
    JLabel inputNoL;
    JTextField inputNoF;
    JButton delBtn;
    Connection conn;
    Statement stmt;
    public StudentManagement2(){
        super("学生基本信息管理系统");
        setGUIComp();
    }
    public void setGUIComp(){
        Container c=getContentPane();
        c.setLayout(new BorderLayout());
        dbTabPane=new JTabbedPane();
        inputP=new JPanel();
        inputP.setLayout(new FlowLayout());
        inputBtn=new JButton("录入");
        inputBtn.addActionListener(this);
        inputInnerPanel=new jiben();
        inputP.add(inputInnerPanel);
        inputP.add(inputBtn);
        dbTabPane.add("录入记录",inputP);
        viewP=new JPanel();
        viewP.setLayout(new BorderLayout());
        viewArea=new JTextArea(6,35);
        viewBtn=new JButton("浏览");
        viewP.add(new JScrollPane(viewArea),BorderLayout.CENTER);
        viewP.add(viewBtn,BorderLayout.SOUTH);
        viewBtn.addActionListener(this);
        dbTabPane.add("浏览记录",viewP);
        updateInnerPanel=new jiben();
        updateI=new JLabel("输入学号：");
        updateIT=new JTextField(10);
        updateIT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewRecord(updateIT.getText(),updateInnerPanel);
                updateIT.setText("");
            }
        });
        updateBtn=new JButton("修改");
        updateBtn.addActionListener(this);
        updateP=new JPanel();
        updateP.add(updateInnerPanel);
        updateP.add(updateI);
        updateP.add(updateIT);
        updateP.add(updateBtn);
        dbTabPane.add("修改记录",updateP);
        delIP=new jiben();
        inputNoL=new JLabel("输入学号");
        inputNoF=new JTextField(20);
        inputNoF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewRecord(inputNoF.getText(),delIP);
                inputNoF.setText("");
            }
        });
        delBtn=new JButton("删除");
        delBtn.addActionListener(this);
        delP=new JPanel();
        delP.add(delIP);
        delP.add(inputNoL);
        delP.add(inputNoF);
        delP.add(delBtn);
        dbTabPane.add("删除记录",delP);
        c.add(BorderLayout.NORTH,dbTabPane);
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
        String name=inputInnerPanel.getNames();
        String gender=inputInnerPanel.getGender();
        String birth=inputInnerPanel.getBirth();
        String  address=inputInnerPanel.getAddress();
        String tel=inputInnerPanel.getTel();
        try{
            connection();
            String sql="INSERT INTO student(学号,姓名,性别,出生年月,家庭住址,联系电话)"+"values("+"'"+no+"',"+"'"+name+"',"+"'"+gender+"',"+"'"+birth+"',"+"'"+address+"',"+"'"+tel+"')";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null,"插入成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close();
        }
    }
    public void viewRecord(String no,jiben p){
        try{
            connection();
            String sql="SELECT * FROM student WHERE 学号="+no;
            ResultSet rs=stmt.executeQuery(sql);
            if (rs.next()){
                p.setNo(rs.getString("学号"));
                p.setName(rs.getString("姓名"));
                p.setGender(rs.getString("性别"));
                p.setBirth(rs.getString("出生日期"));
                p.setAddress(rs.getString("家庭住址"));
                p.setTel(rs.getString("联系电话"));
            }
        }catch (SQLException e){
            System.err.println("浏览学生记录失败");
            System.err.println(e.getSQLState()+e.getMessage());
        }
        finally {
            close();
        }
    }
    public void viewRecords(){
        try{
            viewArea.setText("");
            String vi="";
            connection();
            ResultSet rs=stmt.executeQuery("SELECT * FROM student");
            ResultSetMetaData rsM=rs.getMetaData();
            int nu=rsM.getColumnCount();
            //获得字段名称
            for (int i=1;i<nu;i++){
                vi+=rsM.getColumnName(i)+"\t";
            }

            vi+="\n";
            //获得数据表的记录
            while (rs.next()){
                for (int i=1;i<nu;i++){
                    vi+=rs.getString(i)+"\t";
                }
                vi+="\n";
                viewArea.setText(vi);
            }
            rs.close();
        }catch(SQLException e1){
            System.err.println("浏览学生记录失败");
            System.err.println(e1.getSQLState()+e1.getMessage());
        }
    }
    public void updateRecord(String no){
        String sql="UPDATE student SET 姓名= ?,"+"性别= ?,"+"出生年月= ?,"+"家庭住址= ?,"+"联系电话= ?"+""+"WHERE 学号= '"+no+"'";
        PreparedStatement stmt;
        try{
            connection();
            stmt=conn.prepareStatement(sql);
            stmt.setString(1,updateInnerPanel.getNames());
            stmt.setString(2,updateInnerPanel.getGender());
            stmt.setString(3,updateInnerPanel.getBirth());
            stmt.setString(4,updateInnerPanel.getAddress());
            stmt.setString(5,updateInnerPanel.getTel());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null,"修改记录成功");
        }catch (SQLException e1){

        }finally {
            close();
        }
    }
    public void deleteRecord(String no){
        String delsql="DELETE FROM student WHERE 学号= '"+no+"'";
        try{
            connection();
            stmt.execute(delsql);
            JOptionPane.showMessageDialog(null,"删除记录成功");
        } catch (SQLException e) {
            System.err.println("浏览学生记录失败");
            System.err.println(e.getSQLState()+e.getMessage());
        }finally {
            close();
        }
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==inputBtn){
            inputRecords();
        }else if (e.getSource()==viewBtn){
            viewRecords();
        }else if (e.getSource()==updateBtn){
            updateRecord(updateInnerPanel.getNo());
        }else if (e.getSource()==delBtn){
            deleteRecord(delIP.getNo());
            delIP.clearContent();
        }
    }
    public static void main(String[]args){
        StudentManagement2 app=new StudentManagement2();
        app.setSize(600,260);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
