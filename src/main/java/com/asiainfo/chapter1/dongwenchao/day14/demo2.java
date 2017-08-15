package com.asiainfo.chapter1.dongwenchao.day14;
import com.asiainfo.chapter1.dongwenchao.day10.JDBC;
import java.sql.*;
/**
 * Created by 超超 on 2017/8/4 0004.
 */
public class demo2 {
    JDBC onecon=new JDBC();
    Connection con=null;//保存数据库连接的成员变量
    private PreparedStatement pstmt=null;
    public void chaxun(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/zuoye","root","root");
            String sql="select * from students";
            /*Statement stmt=conn.createStatement();*/
            PreparedStatement stmt=conn.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();//处理结果集
            while (rs.next()){
                String Id=rs.getString("Id");
                String name=rs.getString("Name");
                String sex=rs.getString("Sex");
                String tel=rs.getString("Tel");
                System.out.println(Id+":"+name+":"+sex+":"+tel);
            }
            rs.close(); // 关闭记录集
            stmt.close();// 关闭声明
            conn.close();//关闭连接
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void chaxunone(String Id){
        con=onecon.getConn();
        ResultSet rs;
        try{
            pstmt=con.prepareStatement( " SELECT * FROM students WHERE Id=? ");
            pstmt.setString(1,Id);
            rs=pstmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t");
            }
            pstmt.close();
            con.close();
        }catch (SQLException e){
            System.out.println("数据库异常" +e);
        }
    }
    public static void main(String[]args){
        demo2 a=new demo2();
        a.chaxunone("1");
        a.chaxun();
    }
}
