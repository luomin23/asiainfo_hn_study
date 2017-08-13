package com.asiainfo.chapter1.zhangle.MailWorks;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mysql.jdbc.Util;
import org.junit.Test;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by del on 2017/8/9.
 */
public class MailArray {
   static MailArray ma=new MailArray();
   //读取数据
    public static String stringFile(){
        String file="D:\\Git\\Git\\asiainfo_hn_study\\Mail.json";
        File f=new File(file);
        InputStream is=null;
        BufferedReader br=null;
        String s="";
        String sn="";
        try {
            is=new FileInputStream(f);
            InputStreamReader isr=new InputStreamReader(is);
            br=new BufferedReader(isr);

            while ((s=br.readLine())!=null){
                String s1=":";
                s=s.replaceAll(s1,"=");
                String s2 = s.replaceAll("[^(a-zA-Z0-9\\u4e00-\\u9fa5\\=\\@\\.\\/)]", "");
                String[] strings=s2.split("[=]");
                if(strings.length>=2) {
                    sn = sn + strings[1] + ",";
                }
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("读取数据异常");
        }catch (Exception e) {
            System.out.println("隐藏异常");
        }finally {

            try {
                br.close();
            } catch (IOException e) {
                System.out.println("关闭");
            }

            try {
                is.close();
            } catch (IOException e) {
                System.out.println("关闭异常");
            }
        }
        return sn;
    }

    /*根据电话查询操作*/
    public Mail select(String telephone){
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Mail mail=null;
        try {
            conn=JDBC.getConnection();
            String sql="select * from Mail where telephone=?";
            ps=conn.prepareStatement(sql);  //设置sql语句
            ps.setString(1,telephone);
            rs=ps.executeQuery();
            if(rs.next()){
                mail=new Mail();
                mail.setName(rs.getString(1));
                mail.setTelephone(rs.getString(2));
                mail.setAddress(rs.getString(3));
                mail.setEmail(rs.getString(4));
                mail.setBorn(rs.getString(5));
            }else{
                System.out.println("查无此人");
            }


        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally{
            JDBC.close(conn,ps,rs);

        }
        return mail;
    }

    public static void insert(){
        Mail mail=null;
        Connection conn;
        PreparedStatement ps=null;
        String s=stringFile();
        String[] st=s.split(",");
        try {
            conn=JDBC.getConnection();

            String sql="insert into Mail values(?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            for(int i=0;i<s.length();i++) {
                ps.setString((i % 5), st[i % 5]);
                ps.executeUpdate();
            }
            System.out.println("添加至数据库成功");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    /*向原有文件追加内容*/
    public static void addContent() throws IOException {
        File f=new File("D:\\Git\\Git\\asiainfo_hn_study\\Mail.text");
        Writer w=null;
        try {
            w = new FileWriter(f);
            w.append(stringFile());
            w.close();
            System.out.println("追加成功");
        }catch (IOException e){
            System.out.println("");
        }
    }

    public void main() throws Exception {
        String s=stringFile();
        String[] strings=s.split(",");
        for(int i=0;i<s.length()-1;i++){
            if(i%5==0){
                System.out.println("\n"+strings[i]);
            }else{
                System.out.print(strings[i]+" ");
            }
        }


    }

}
