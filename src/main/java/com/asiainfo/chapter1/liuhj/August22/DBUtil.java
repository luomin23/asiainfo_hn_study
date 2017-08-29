package com.asiainfo.chapter1.liuhj.August22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtil {
    private static final String URL="jdbc:mysql://localhost:3306/test";
    private static final String NAME="root";
    private static final String PASSWORD="root";

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(URL,NAME,PASSWORD);

        Statement statement =connection.createStatement();
        ResultSet resultSet =statement.executeQuery("select name,age from Person");

        while (resultSet.next()){
            System.out.println(resultSet.getString("name")+","+resultSet.getInt("age"));
        }
    }
}
