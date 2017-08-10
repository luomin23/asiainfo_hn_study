package com.asiainfo.chapter1.dongwenchao.day10;


import java.sql.Connection;

/**
 * Created by 超超 on 2017/8/5 0005.
 */
public class demo4 {
    public static void main(String []args){
        Connection conn=JDBC.getConn();
        System.out.print(conn);
    }
}
