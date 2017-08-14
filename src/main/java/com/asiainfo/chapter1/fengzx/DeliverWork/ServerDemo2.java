package com.asiainfo.chapter1.fengzx.DeliverWork;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;

/**
 * Created by fengzx on 2017/8/13.
 */
public class ServerDemo2 {
    static String g="";
    static String get(String name){
        Connection conn = DButil.getConn();
        PreparedStatement pstmt = null;
        ResultSet rs;

        try {
            pstmt = conn.prepareStatement("SELECT * from contact where name = ? ");
            pstmt.setString(1,name);
            rs = pstmt.executeQuery();

            while (rs.next()){
              //  System.out.println(rs.getString(1) + "\t" +rs.getString(2) + "\t" + rs.getString(3)+ "\t" + rs.getString(4)+ "\t" + rs.getString(5));
                g=rs.getString(1) + "\t" +rs.getString(2) + "\t" + rs.getString(3)+ "\t" + rs.getString(4)+ "\t" + rs.getString(5);
                System.out.println(g);
            }

        }catch (SQLException e){
            System.out.println("数据库读取异常："+e);
        }
        return g;
    }
    public static void main(String[] args) {

        try {
            ServerSocket ss2 = new ServerSocket(5555);

            Socket s2 = ss2.accept();

            BufferedReader br = new BufferedReader(new InputStreamReader(s2.getInputStream()));

            String line = null;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                get(line);
            }
//            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(s2.getOutputStream()));
//            writer.write(get(line));
//            writer.newLine();
//            writer.flush();
//            writer.close();
//            br.close();

            OutputStream os = s2.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(get(line));
            dos.close();
            os.close();
            br.close();
            s2.close();
            ss2.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
