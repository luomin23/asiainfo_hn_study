package com.asiainfo.chapter1.liuhj.tcpzuoye.tcp;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static DataInputStream inputStream;
    public static DataOutputStream outputStream;
    public static Socket socket;
   static String ss;

    public static void main(String[] args) {
        /*
        *tcp传输，客户端建立的过程
        //客户端发数据到服务器端
        * 1 创建tcp客户端的socket服务，使用的是socket对象
        * 建议该对象已建立就明确目的地，要连接的主机
        *
        * 2 如果连接建立成功，说明数据传输通道已建立
        * 该通道就是socket流，是底层建立好的。既然是流就说明这里有输入也有输出。
        * 想要输出或输出流对象，可以找Socket来获取
        * 可以通过getOutPutStream()和getInputStream()来获取两个字节流
        *
        *3使用输出流将数据写出
        *
        * 4关闭资源
        *
        *
        *
        * */
        try{
            File ff=new File("F:\\Git\\lhjworkspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\liuhj\\tcpzuoye\\tcp\\lhj.txt");
            InputStreamReader f=new InputStreamReader(new FileInputStream(ff),"UTF-8");

            //  FileInputStream f=new FileInputStream("F:\\Git\\lhjworkspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\liuhj\\August09\\tcp\\lhj.txt");
            int a=f.read();
            for (int i=0;a!=-1;i++){
                System.out.print((char)a);
                a=f.read();
                ss+=(char)a;
            }
        }catch (Exception e){
        }
        try {
             //创建socket服务
            Socket socket= new Socket("127.0.0.1",7501);
            //读取服务器端返回的数据，使用socket
            inputStream=new DataInputStream(socket.getInputStream());
            outputStream=new DataOutputStream(socket.getOutputStream());//使用输出流将制定的数据写出去
            outputStream.writeUTF(ss);
//            String s= inputStream.readUTF();
//            System.out.println(s);
            outputStream.close();
            socket.close();
            inputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
