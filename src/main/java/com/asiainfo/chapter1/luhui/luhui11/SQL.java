package com.asiainfo.chapter1.luhui.luhui11;
import com.asiainfo.chapter1.luhui.luhui10.MySQL;
import java.sql.Connection;
import java.sql.*;

/**
 * Created by 18237161432 on 2017/8/7.
 */
public class SQL {
    MySQL onecon=new MySQL();
    Connection con=null;
    private Statement stmt=null;
    private PreparedStatement pstmt=null;
    public void getOneStudent(String sno) throws ClassNotFoundException {
       con=onecon.getConnection();
        ResultSet rs;
        try{
            pstmt=con.prepareStatement("select*from student where sno=?");
                    pstmt.setString(1,sno);
            rs=pstmt.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
            }
            stmt.close();
            con.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void getAllStudent() throws SQLException {
        con = (Connection) con.createStatement();
        ResultSet rs;
        try{
            stmt=con.createStatement();
            rs=stmt.executeQuery("slelct*from student");
            while(rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
            }
            stmt.close();
            con.close();
        }catch(SQLException e2){
            System.out.println(e2);
        }
    }
public static void main(String [] args) throws ClassNotFoundException {
    SQL qs=new SQL();
    //qs.getAllStudent();
    qs.getOneStudent("1");

}
}
