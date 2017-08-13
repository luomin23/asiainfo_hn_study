package com.asiainfo.chapter1.zhangle.MailWorks;

import java.io.*;
import java.net.Socket;

/**
 * Created by del on 2017/8/12.
 * 对客户端发送的数据进行处理发送给服务器
 */
public class MailSend extends Thread{
    private Socket s;  //当前连接的对象
    static MailArray mailArray=new MailArray();

    public MailSend(Socket s){
        this.s=s;

    }
    public void run(){
        try {
            //获取输入字节流，读取客户端请求信息
            InputStream is = s.getInputStream();

            //将字节流包装成字符流
            InputStreamReader isr = new InputStreamReader(is);

            //为字符输入流添加缓冲
            BufferedReader br = new BufferedReader(isr);

            //获取输出字节流，响应客户端的信息
            OutputStream os = s.getOutputStream();

            //将字节流包装成为字符打印流
            PrintWriter pw = new PrintWriter(os);

            //读取字符输入流中的数据信息
            String st=null;
            while (null != (st = br.readLine())) {
                System.out.println("我是服务器端，客户端说：" +st);

                //调用shutdown方法关闭输入流
                s.shutdownInput();
                if (st.equals( "用户名:zl,密码:1234")) {
                   pw.write("请选择读取所有信息(按1)|查询个人信息(输入手机号):");

                }else if(st.equals("查询所有完成")){
                    //mailArray.insert();
                    pw.write("添加至数据库成功");

                }else if(st.equals("查询个人完成")){
                    pw.write("请选择读取所有信息(按1)|查询个人信息(输入手机号):");

                }else{
                    pw.write("结束");

                }
                pw.flush();
                break;

            }

        } catch (Exception e) {
            System.out.println("IO流异常");
        }
    }
}
