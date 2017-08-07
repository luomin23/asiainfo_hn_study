package com.asiainfo.chapter1.zhangle.August4th;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * Created by del on 2017/8/4.
 */
public class DatebaseWorks {
   /*查询操作*/
    public Roles select(int id){
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Roles roles=null;
        try {
            conn=JDBC.getConnection();
            String sql="select * from Roles where id=?";
            ps=conn.prepareStatement(sql);  //设置sql语句
            ps.setInt(1,id);
            rs=ps.executeQuery();
            if(rs.next()){
                roles=new Roles();
                roles.setId(rs.getInt(1));
                roles.setName(rs.getString(2));
                roles.setPassword(rs.getInt(3));
            }

        } catch (ClassNotFoundException e) {
            System.out.println("未连接数据库");
        } catch (Exception e) {
            System.out.println("SQLException情况");
            e.printStackTrace();
        }finally{
            JDBC.close(rs,ps,conn);

        }
        return roles;
    }

    public static void main(String[] args) {
        DatebaseWorks ds=new DatebaseWorks();
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入查询的人物id：");
        int id=sc.nextInt();
        Roles r=ds.select(id);
        while(r!=null){
            System.out.println(r.toString());
        }
        /*百度后也不明白怎么解决
        运行后发生java.lang.NoClassDefFoundError:
        Could not initialize class com.asiainfo.chapter1.zhangle.August4th.JDBC
        */

    }

}
