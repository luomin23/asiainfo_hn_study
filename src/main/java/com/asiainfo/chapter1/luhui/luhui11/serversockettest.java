package com.asiainfo.chapter1.luhui.luhui11;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by 18237161432 on 2017/8/8.
 */
public class serversockettest {
    public static void main(String[] args){

        try{
        Socket socket=new Socket("127.0.0.1",8888);//客户端;
        File file=new File("D:\\ideaIU\\Git\\lh\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\luhui\\a.txt");
            BufferedReader buffer=new BufferedReader(new FileReader(file));
            PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
            String line=null;
            while((line=buffer.readLine())!=null){
                out.println(line);
                System.out.println("客户端读取文件里的内容"+line);
            }




            System.out.println("客户端发完了");
            BufferedReader bufin=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            socket.shutdownOutput();
            String result=bufin.readLine();
            System.out.println("客户端接收到了服务器的数据了");
            System.out.println(result);
            buffer.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }

