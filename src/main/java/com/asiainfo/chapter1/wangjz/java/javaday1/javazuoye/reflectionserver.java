package com.asiainfo.chapter1.wangjz.java.javaday1.javazuoye;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by wjz123456 on 2017/8/8.
 */
public class reflectionserver {
    public static void main(String[] args) throws Exception {
        String a;
        Class<UDPServer> clazz=UDPServer.class;
        UDPServer u=clazz.newInstance();
          System.out.println(u);
        Field f1=clazz.getDeclaredField("name");
        f1.set(u,"王景州");
        System.out.println(u.getName());
        System.out.println(u.getAdd());
        System.out.println(u);
//        demo d1=new demo();
//        System.out.println(d1);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123456");
            Statement stmt=conn.createStatement();
          //  String sql1="insert into txl (add,name,age,tel,email) values('"+d1.getAdd()+"','"+d1.getName()+"','"+d1.getAge()+"','"+d1.getTel()+"','"+d1.getEmail()+"')";
            String sql1="insert into txl values('"+u.name+"','"+u.age+"','"+u.add+"','"+u.getTel()+"','"+u.getEmail()+"');";
            boolean resultSet=stmt.execute(sql1);
             System.out.println(resultSet);
            conn.close();
        }catch (Exception e){
        e.printStackTrace();
        }
    }
}
