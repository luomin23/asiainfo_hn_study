package com.asiainfo.chapter1.xushuo.ScoketDemo03;

import com.asiainfo.chapter1.xushuo.ScoketDemo03.Jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by root on 2017/8/12.
 */
public class Jdbc03 {
    public static Connection getConnection() {

        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/socketdemo01";
        String user = "root";
        String password = "root";

        try {

            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Jdbc03.class.getName()).log(Level.SEVERE,null, ex);
        }
        return con;

    }
}