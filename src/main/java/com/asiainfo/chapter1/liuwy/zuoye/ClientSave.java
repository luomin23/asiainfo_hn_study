package com.asiainfo.chapter1.liuwy.zuoye;

import com.asiainfo.chapter1.liuwy.zuoye.Demo;

import java.io.*;
import java.net.Socket;

/**
 * Created by LENOVO on 2017/8/12.
 */
public class ClientSave {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("127.0.0.1",9999);

            //输出解析文件
            System.out.println("读取文件内容如下！");
            Demo demo=new Demo();
            demo.reader();
            //传送demo对象流
            ObjectOutputStream oos=new ObjectOutputStream(
                    socket.getOutputStream()
            );
            oos.writeObject(demo);
            //  socket.shutdownOutput();


            //第二部：通过手机号查询信息
            System.out.print("请输入查询手机号：");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(
                    socket.getOutputStream()));
            String line=null;
            while ((line=br.readLine())!=null){
//                if("over".equals(line)){
//                    continue;
//                }
                bw.write(line);

                bw.flush();
                break;
            }

            socket.shutdownOutput();

            //得到返回结果
            InputStream is=socket.getInputStream();
            InputStreamReader inputStreamReader=new InputStreamReader(is);
            BufferedReader br2=new BufferedReader(inputStreamReader);
            String s=br2.readLine();
            System.out.println(s);



        } catch (IOException e) {
            e.printStackTrace();
        }





        }
}
