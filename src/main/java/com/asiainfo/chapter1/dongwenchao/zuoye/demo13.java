package com.asiainfo.chapter1.dongwenchao.zuoye;
import com.asiainfo.chapter1.dongwenchao.day10.JDBC;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by 超超 on 2017/8/7 0007.
 */
//服务端
public class demo13 {
    public static void main(String[]args) throws IOException {
        //建立服务端Socket
        ServerSocket ss = new ServerSocket(1);
        //接收客户端Socket
        Socket fileLoaderSocket = ss.accept();
        //打印连接信息
        String ip = fileLoaderSocket.getInetAddress().getHostAddress();
        System.out.println(ip + "...conncected");
        //接收文件，并保存
        InputStream in = fileLoaderSocket.getInputStream();//getInputStream()方法是返回此套接字的输入流。返回是将字节写入此套接字的输入流。
        //实例化对象fileSave
        OutputStream fileSave = new FileOutputStream("D:\\Java\\Git\\test\\asiainfo_hn_study\\aauio.txt");//用于写入诸如图像数据之类的原始字节的流。要写入字符流，请考虑使用 FileWriter。
        //建立数组buf
        byte[] buf = new byte[1024];
        int len = 0;
        //判断是否读到文件末尾
        while((len=in.read(buf)) != -1)
        {
            com.asiainfo.chapter1.dongwenchao.zuoye.demo1 demo= new com.asiainfo.chapter1.dongwenchao.zuoye.demo1();
            String temp =  new String(buf);
            String [] lenStr  =  temp.split(";");//split()方法根据给定正则表达式的匹配拆分此字符串。，遇到“；”就换个数组
            for(int i =0;i<lenStr.length-1;i++){
                String [] sonStr = lenStr[i].split("\\|");//遇到“|”就换个数组
                Pattern p = Pattern.compile("\\s*|\t|\r|\n");//Pattern类是任意格式都能兼容
                Matcher m= p.matcher(sonStr[0]);//创建匹配给定输入与此模式的匹配器。
                demo.setId(m.replaceAll(""));
                /*demo.setName(sonStr[0]);*/
                demo.setName(sonStr[1]);
                demo.setSex(sonStr[2]);
                demo.setTel(sonStr[3]);
                System.out.println("读取到的内容是:"+demo.toString());
                saveStu(demo);
            }
            fileSave.write(buf, 0, len);
            //刷新
            fileSave.flush();
        }
        //返回文件复制情况信息
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fileLoaderSocket.getOutputStream()));
        out.write("文件上传成功");
        //刷新
        out.flush();
        //资源关闭
        ss.close();
        fileLoaderSocket.close();
        fileSave.close();
}
    private static void saveStu(com.asiainfo.chapter1.dongwenchao.zuoye.demo1 demo){
        Connection conn = JDBC.getConn();
        String sql ="insert into students(Id,Name,Sex,Tel)values("+demo.getId()+",'"+demo.getName()+"','"+demo.getSex()+"','"+demo.getTel()+"')";
        PreparedStatement ps =null;
        try {
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBC.close(conn,ps);
        }
    }
}
