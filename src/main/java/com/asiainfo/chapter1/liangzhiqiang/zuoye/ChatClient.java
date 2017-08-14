package com.asiainfo.chapter1.liangzhiqiang.zuoye;

/**
 * Created by 君不悔 on 2017/8/13.
 */
/*基于UDP的Socket编写客户端程序*/
    import java.io.BufferedReader;
    import java.io.FileInputStream;
    import java.io.FileReader;
    import java.net.DatagramPacket;
    import java.net.DatagramSocket;
    import java.net.InetAddress;
public class ChatClient {
     static String tempString;
    static  String ss;
    public static void main(String args[]){
        DatagramPacket inPacket;
        InetAddress sAddr;
        byte[]inBuffer=new byte[100];

        try{
            //FileInputStream f=new FileInputStream("F:\\yaxin\\Git\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\liangzhiqiang\\zuoye\\tel.txt");
            System.out.println("信息：");
            BufferedReader reader = new BufferedReader(new FileReader("F:\\yaxin\\Git\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\liangzhiqiang\\zuoye\\tel.txt"));

            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println(tempString);
                ss+=tempString;
                line++;
            }
            reader.close();

        }catch (Exception e){
e.printStackTrace();
        }
        try {
            DatagramSocket dSocket=new DatagramSocket();
            if (args.length==0)
                sAddr=InetAddress.getByName("127.0.0.1");
            else
                sAddr=InetAddress.getByName(args[0]);
            byte[]outBuffer=ss.getBytes();
            /*创建一个对象用于发送客户端的数据包，定义包的大小，以及要发送到的地址和端口号，即目的地以及端口号。*/
            DatagramPacket outPacket=new DatagramPacket(outBuffer,outBuffer.length,sAddr,8000);
            dSocket.send(outPacket);//发送数据报
            //接收服务器发送的数据
            inPacket=new DatagramPacket(inBuffer,inBuffer.length);
            dSocket.receive(inPacket);     //接受数据报
            ss=new String(inPacket.getData(),0,inPacket.getLength());
            System.out.println("接收到服务器端消息："+ss);

            dSocket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
