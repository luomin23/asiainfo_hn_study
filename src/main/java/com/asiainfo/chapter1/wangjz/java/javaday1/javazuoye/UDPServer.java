package com.asiainfo.chapter1.wangjz.java.javaday1.javazuoye;
import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;

/**
 * Created by wjz123456 on 2017/8/7.
 */
public class UDPServer {
    public static String name;
    public static String age;
    public static String add;
    public static String tel;
    public static String email;
    public UDPServer(String name, String age, String add, String tel, String email) {
        this.email = email;
        this.name = name;
        this.tel = tel;
        this.age = age;
        this.add = add;
    }

    public UDPServer() {

    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getAdd() {
        return add;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Test
    @Override
    public String toString() {
        return "UDPServer{" +
                "add='" + add + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException {
        UDPServer d = new UDPServer();
        DatagramSocket dSocket;
        DatagramPacket inPacket;
        DatagramPacket outPacket;
        InetAddress cAddr;
        int cport;
        byte[] inBuffer = new byte[100];
        byte[] outBuffer;
            dSocket = new DatagramSocket(7601);
            inPacket = new DatagramPacket(inBuffer, inBuffer.length);
            dSocket.receive(inPacket);
            cAddr = inPacket.getAddress();
            cport = inPacket.getPort();
            String s = new String(inPacket.getData(), 0, inPacket.getLength());
            d.setName(s.substring(0, 3));
            age = s.substring(4, 6);
            d.setAdd(s.substring(7, 10));
            d.tel = s.substring(10, 22);
            d.email = s.substring(22, 39);
//            System.out.println(name);
//            System.out.println(age);
//            System.out.println(add);
//            System.out.println(tel);
//            System.out.println(email);
            //  System.out.println(s);
            //  System.out.println(s.length());
//            System.out.println(cAddr.getHostName());
//            System.out.println(cport
            Date d1 = new Date();
            outBuffer = d1.toString().getBytes();
            outPacket = new DatagramPacket(outBuffer, outBuffer.length, cAddr, cport);
            dSocket.send(outPacket);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123456");
            Statement stmt=conn.createStatement();
            String sql1="insert into txl values('"+name+"','"+age+"','"+add+"','"+tel+"','"+email+"');";
            boolean resultSet=stmt.execute(sql1);
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        }

    }
