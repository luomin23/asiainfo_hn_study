package com.asiainfo.chapter1.xushuo.ScoketDemo03;


import java.sql.*;
//增加和查询的方法

public class OperationDB02 {
    PreparedStatement pstmt=null;
    private Connection con = null;

    public void addRcorder(InfoBean infoBean) throws SQLException{
        if(con ==null){
            con = Jdbc03.getConnection();
            System.out.println("数据库已连接");
        }

        String sql = "insert into communication(numberz,namez,site,Emil,birthday)VALUE (?,?,?,?,?)";

        PreparedStatement pstmt = con.prepareStatement(sql);
        //PreparedStatement预编译，可以通过？来进行赋值，？为占位符

        pstmt.setString(1, infoBean.getNumberz());
        pstmt.setString(2, infoBean.getNamez());
        pstmt.setString(3, infoBean.getSite());
        pstmt.setString(4, infoBean.getEmil());
        pstmt.setString(5, infoBean.getBitrthday());
        //对Socket里占位符进行赋值

        pstmt.executeUpdate();
        //执行上面的Socket语句  JDBC封装的执行方法
    }
    public void selectUser(String numberz) throws SQLException {

        if(con ==null){
            con = Jdbc03.getConnection();
        }
        String sql="select * from communication where numberz = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, numberz);

        ResultSet result=pstmt.executeQuery();
        //返回的结果集
        InfoBean infoBean=new InfoBean();
        infoBean.setNumberz(numberz);
        String nameza;
        //赋值
        if(result.next()){
            infoBean.setNumberz(numberz);
            infoBean.setNamez(result.getString(2));
            infoBean.setSite(result.getString(3));
            infoBean.setEmil(result.getNString(4));
            infoBean.setBitrthday(result.getNString(5));
            System.out.println(infoBean.getNumberz()+infoBean.getNamez()
                    +infoBean.getSite()+infoBean.getEmil()+infoBean.getBitrthday()+"");
        }



    }
}
