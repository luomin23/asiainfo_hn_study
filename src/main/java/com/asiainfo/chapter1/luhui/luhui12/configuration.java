package com.asiainfo.chapter1.luhui.luhui12;

import java.sql.*;

/**
 * Created by 18237161432 on 2017/8/8.
 */
public class configuration {
}

   class connect{
        Connection con=null;
        public Connection getConnection() throws ClassNotFoundException {
         String username="root";
        String password="root";
        String url="jdbc:mysql://localhost:3306/student";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con= DriverManager.getConnection(url,username,password);
                System.out.println(con);
            }catch(SQLException e){
                System.out.println(e);
            }
            return con;
    }
        public void closeConnection() {
            try {
                con.close();//关闭数据库连接对象。

            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
    class sqladd {
        connect onecon2=new connect();
        Connection con=null;
        private Statement stmt=null;
        private PreparedStatement pstmt=null;//
    public int addStudentDataInfo(String sno,String sname,int sage,String smajor) {
        int count=0;
        try {
            con=onecon2.getConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{
            String str="insert into s1 values(?,?,?,?)";
            pstmt=con.prepareStatement(str);//与createStatement相比prepareStatement更有优势，尽量用后者；
            pstmt.setString(1,sno);
            pstmt.setString(2,sname);
            pstmt.setInt(3,sage);
            pstmt.setString(4,smajor);
            count=pstmt.executeUpdate();
        }catch(SQLException e1){
            System.out.println(e1);
        }finally{
            try{
                pstmt.close();
                con.close();
            }catch(SQLException e){
                System.out.println("关闭出现问题"+e);
            }
        }
        return count;
    }

    }
 class chuangjian {
    Connection con=null;//保存数据库连接的成员变量；
    private Statement stmt=null;
    public boolean createBookDataTable() throws ClassNotFoundException {
        connect onecon1=new connect();//创建数据库连接对象；
        con=onecon1.getConnection();//得到数据库连接对象；
        boolean returnResult=true;//保存是否创建成功变量；
        try{
            stmt=con.createStatement();//建立statement类对象；
            //声明创建学生表student的SQL语句；
            String pSql="create table s1 (sno char(10),sname char(20),sage integer,smajor char(10))";
            stmt.executeUpdate(pSql);//执行SQL语句；
            stmt.close();//关闭释放statement所连接的数据量及JDBC资源；
            con.close();//关闭数据库连接；
        }catch (SQLException e){//对数据库读取时产生的异常进行处理；
            System.out.println(e);
            returnResult=false;
        }
        return returnResult;
    }}




