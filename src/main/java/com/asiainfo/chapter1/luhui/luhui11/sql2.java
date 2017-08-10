package com.asiainfo.chapter1.luhui.luhui11;

import com.asiainfo.chapter1.luhui.luhui10.MySQL;

import java.sql.*;

/**
 * Created by 18237161432 on 2017/8/7.
 */
public class sql2 {
  MySQL onecon=new MySQL();
    Connection con=null;
    private Statement stmt=null;
    private PreparedStatement pstmt=null;//
    /*public boolean addStudentDataInfo() throws ClassNotFoundException {
        con =onecon.getConnection();
        boolean s=true;
        try{
            stmt=con.createStatement();
            String r1="insert into s1(sno ,sname,sage,smajor)values('20171102','梦如',20,'cs')";
            stmt.executeUpdate(r1);
            stmt.close();
            con.close();
        }catch(SQLException e){
            System.out.println(e);
            s=false;
        }
        return s;
    }*/
    public int addStudentDataInfo(String sno,String sname,int sage,String smajor,String sd) {
        int count=0;
        try {
            con=onecon.getConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{
            String str="insert into s2 values(?,?,?,?,?)";
            pstmt=con.prepareStatement(str);//与createStatement相比prepareStatement更有优势，尽量用后者；
            pstmt.setString(1,sno);
            pstmt.setString(2,sname);
            pstmt.setInt(3,sage);
            pstmt.setString(4,smajor);
            pstmt.setString(5,sd);
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
    public static void main(String[] args) throws ClassNotFoundException {
        sql2 c=new sql2();

       /* boolean isSuccess=c.addStudentDataInfo();
        if(isSuccess)
            System.out.println("The table is created.");
        else
            System.out.println("The table is not created.");*/
        int count=c.addStudentDataInfo("2017109","爱玲",20,"infomation","陆辉");
        System.out.println(count+"条记录被添加到数据表中");
    }


}
