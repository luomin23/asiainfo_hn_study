package com.asiainfo.chapter1.luhui.zuoye;

import com.asiainfo.chapter1.luhui.luhui11.SQL;
import com.asiainfo.chapter1.luhui.luhui10.MySQL;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 18237161432 on 2017/8/11.
 */
//服务端
public class searchServersocket  extends SQL {
    public static void main(String[] args) {
        SQL qs=new SQL();
        try {
            // 构造方法绑定了一个端口
            ServerSocket serverSocket = new ServerSocket(6666);
            /**
             * serverSocket.accept()等待客户端连接，是一个阻塞方法，直到有客户端连接时才会返回。
             * 此方法返回的是包含客户端信息的套接字。 该方法成功返回之后，服务器就和客户端建立了一个可靠的连接，可以相互发送和接收消息了
             */
            Socket socket = serverSocket.accept();
            System.out.println("IP:" + socket.getInetAddress() + ",port:"
                    + socket.getPort());

            /**
             * 使用输入流接收消息
             */
            InputStream inputStream = socket.getInputStream();// 获取输入管道
           /* BufferedReader reader = new BufferedReader(new InputStreamReader(
                    inputStream));*/
            DataInputStream dis = new DataInputStream(inputStream);
            // readLine()是阻塞方法，直到读到内容并且遇到终止符（“\r”、“\n”、“\r\n”等等）或者到达流的末尾（返回Null）才返回
            //System.out.println(dis.readChar());
            /*String s=String.valueOf(dis.readChar());
            System.out.println(s);*/
            String s=dis.readUTF();
            System.out.println(s);


            //将传递的值在数据库中进行匹配查找；
           qs.getOneStudent(s);//输出数据库中查找到的信息；




            /**
             * 使用输出流发送消息
             */
            OutputStream outputStream = socket.getOutputStream();// 获取输出管道
            // 末尾必须加终止符，否则另一端的bufferedreader.readline()方法会处于阻塞状态，直到流关闭
            DataOutputStream daot=new DataOutputStream(outputStream);
            daot.writeUTF(qs.getOneStudent(s));
          //  outputStream.write("查询成功\r".getBytes());
            outputStream.flush();
            daot.close();

            outputStream.close();
            inputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

  /*class SQL {//数据库查询；

        public void getOneStudent(String sname) throws ClassNotFoundException {
            con=onecon.getConnection();
            ResultSet rs;//保存查询结果集；
            try{
                pstmt=con.prepareStatement("select*from s3 where sname=?");
                pstmt.setString(1,sname);//给参数设定值；
                rs=pstmt.executeQuery();//查询结果保存在结果集中。
                while (rs.next()){//输出每条记录。
                    //检索当前行中指定列的值。
                    System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
                }
                con.close();
                //stmt.close();

            }catch(SQLException e){
                System.out.println(e);
            }
        }
     }*/}








