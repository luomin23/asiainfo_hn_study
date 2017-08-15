package com.asiainfo.chapter1.fengzx.DeliverWork;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by fengzx on 2017/8/8.
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(3333);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String line = null;
        String name = null;
        String tel = null;
        String address = null;
        String email = null;
        String date = null;
        while ((line = br.readLine()) != null){

            String[] arr = line.split(" +");

            for (int x = 0;x<5;x++) {
                System.out.println(arr[x]);
                if (x == 0) {
                    name = arr[x];
                }if (x == 1){
                    tel = arr[x];
                }if (x == 2){
                    address = arr[x];
                }if (x == 3){
                    email = arr[x];
                }if (x == 4){
                    date = arr[x];
                }

            }
            save(name,tel,address,email,date);
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        writer.write("文件上传成功");
        writer.newLine();
        writer.flush();

        //bw.close();
        s.close();
        ss.close();
    }


    static int save(String name, String tel, String address, String email, String date) {
        Connection conn = DButil.getConn();
            PreparedStatement stmt = null;
        try {
            String sql="insert into contact values(?,?,?,?,?)";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1,name);
            stmt.setString(2,tel);
            stmt.setString(3,address);
            stmt.setString(4,email);
            stmt.setString(5,date);
            stmt.executeUpdate();
        }catch (SQLException e){
            System.out.println("数据库异常："+e);
        }finally {
            try {
                stmt.close();
                conn.close();
            }catch (SQLException e){
                System.out.println("关闭数据库是出现错误："+e);
            }
        }
        return 0 ;
    }
}
