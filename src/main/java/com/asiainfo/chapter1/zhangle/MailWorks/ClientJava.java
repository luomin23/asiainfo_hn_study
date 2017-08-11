package com.asiainfo.chapter1.zhangle.MailWorks;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by del on 2017/8/8.
 *  客户端
 */
public class ClientJava {
    static Scanner sc=new Scanner(System.in);
    public static void works(){
        while (true){
            System.out.println("请选择您需要的操作:查询通讯录的信息(按1)|查询个人信息(按2)|退出(按3)");
            int select=sc.nextInt();
            if(select==1){
                //查询通讯录的信息
            }else if(select==2){
                //查询个人信息
            }else {
                break;
            }

        }

    }

    public static void main(String[] args) {
        try {
            // 1.建立客户端,输入服务器的地址以及端口
            Socket socket=new Socket("localhost",8008);
            // 获取输出流，向服务器打印信息
            OutputStream os=socket.getOutputStream();
            //包装成打印流
            PrintWriter pw=new PrintWriter(os);

            System.out.print("请输入用户名:");
            String name=sc.next();
            System.out.print("请输入密码:");
            int pwd=sc.nextInt();
            pw.write("用户名:"+name+",密码:"+pwd+'\n');
            //根据操作获得信息 向服务器传入不同数据
            //works();
            //刷新缓存
            pw.flush();
           //关闭Socket的输出流
            socket.shutdownOutput();

            //3、获取输入字节流,读取服务器端的响应信息
            InputStream is = socket.getInputStream();

            //将输入字节流包装成字符字符流
            InputStreamReader isr = new InputStreamReader(is);

            //为字符流添加缓冲区
            BufferedReader br = new BufferedReader(isr);

            //通过服务器端的响应信息
            String data = null;
            while(null != (data=br.readLine())){
                System.out.println(new Date());
                System.out.println("我是客户端，服务器端说："+data);
            }
            //关闭Socket输入流
            socket.shutdownInput();

            //4、关闭资源
            br.close();
            isr.close();
            is.close();
            pw.close();
            os.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
