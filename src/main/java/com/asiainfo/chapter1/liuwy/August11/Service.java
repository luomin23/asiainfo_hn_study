package com.asiainfo.chapter1.liuwy.August11;

import com.asiainfo.chapter1.liuwy.zuoye.Person;
import com.asiainfo.chapter1.liuwy.August08.PropertiesUtil;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by LENOVO on 2017/8/11.
 */
public class Service {
    public static void main(String[] args) throws Exception{
        System.out.println("服务器开启！");
        try {
            ServerSocket serverSocket=new ServerSocket(9999);

                Socket socket = serverSocket.accept();

                //InputStream is=socket.getInputStream();

            OutputStream os=socket.getOutputStream();
            PrintWriter pw=new PrintWriter(os);
            pw.write("1 保存 2 查询");
            pw.flush();

            pw.write("\r\n");
            pw.flush();
            Person person=new Person();
            person.setAddress("111");
            pw.write(person.getAddress());
            pw.write("请输入:");
            pw.flush();
//            OutputStream os=socket.getOutputStream();
//            PrintWriter pw=
            socket.shutdownOutput();


//            BufferedReader br=new BufferedReader(new InputStreamReader(
//                    socket.getInputStream()
//            ));
//            BufferedWriter bw=new BufferedWriter(new FileWriter("bw.txt"));
//            String line=null;
//            while((line=br.readLine())!=null){
//                bw.write(line);
//                bw.newLine();
//                bw.flush();
//            }
//            bw.close();
//            socket.close();
//            serverSocket.close();


            BufferedReader br=new BufferedReader(new InputStreamReader(
                    socket.getInputStream()
            ));
            String line=null;
            while ((line=br.readLine())!=null){
                if(br.readLine().equals("2")){
                    System.out.println("2");
                    String classname= PropertiesUtil.getProperty("classname");
                    String methodname=PropertiesUtil.getProperty("method");
                    System.out.println(classname);

                    Class c=Class.forName(classname);
                    Constructor con=c.getConstructor();
                    Object obj=con.newInstance();

                    Method m=c.getMethod(methodname);
                    m.invoke(obj);

                }
                System.out.println(line);
            }
            socket.close();
            serverSocket.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("服务器结束！");
    }
}
