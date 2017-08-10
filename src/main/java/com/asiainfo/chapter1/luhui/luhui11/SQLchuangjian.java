package com.asiainfo.chapter1.luhui.luhui11;

import com.asiainfo.chapter1.luhui.luhui10.MySQL;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by 18237161432 on 2017/8/7.
 */
public class SQLchuangjian {
    Connection con=null;//保存数据库连接的成员变量；
    private Statement stmt=null;
    public boolean createBookDataTable() throws ClassNotFoundException {
        MySQL onecon=new MySQL();//创建数据库连接对象；
        con=onecon.getConnection();//得到数据库连接对象；
        boolean returnResult=true;//保存是否创建成功变量；
        try{
            stmt=con.createStatement();//建立statement类对象；
            //声明创建学生表student的SQL语句；
            String pSql="create table s2 (sno char(10),sname char(100),sage integer,smajor char(10),sd char(100))";
            stmt.executeUpdate(pSql);//执行SQL语句；
            stmt.close();//关闭释放statement所连接的数据量及JDBC资源；
            con.close();//关闭数据库连接；
        }catch (SQLException e){//对数据库读取时产生的异常进行处理；
            System.out.println(e);
            returnResult=false;
        }
        return returnResult;
    }
    public static void main(String[] args) throws ClassNotFoundException {
        SQLchuangjian c=new SQLchuangjian();
        boolean isSuccess =c.createBookDataTable();
        if(isSuccess)
            System.out.println("The table is created.");
        else
            System.out.println("The table is not created.");
    }
}
