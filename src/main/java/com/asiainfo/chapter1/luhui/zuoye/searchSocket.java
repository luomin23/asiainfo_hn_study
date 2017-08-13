package com.asiainfo.chapter1.luhui.zuoye;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;


/**
 * Created by 18237161432 on 2017/8/11.
 */
//客户端
public class searchSocket {
    public static void main(String[] args) {
        try {
            /**
             * 构造方法指定了远程主机的IP和端口号。 成功创建对象之后，客户端就和服务器建立了一个可靠的连接，可以相互发送和接收消息了
             */
            Socket socket = new Socket("127.0.0.1", 6666);

            /**
             * 使用输出流发送消息
             */
            OutputStream outputStream = socket.getOutputStream();// 获取输出管道
            // 末尾必须加终止符，否则另一端的bufferedreader.readline()方法会处于阻塞状态，直到流关闭
            DataOutputStream da=new DataOutputStream(outputStream);
            da.writeUTF("13828736486");



            /**
             * 使用输入流接收消息
             */
            InputStream inputStream = socket.getInputStream();// 获取输入管道
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    inputStream));
            // readLine()是阻塞方法，直到读到内容并且遇到终止符（“\r”、“\n”、“\r\n”等等）或者到达流的末尾（返回Null）才返回

            String u=reader.readLine();
            //System.out.println(reader.readLine());
            FileWriter fw=new FileWriter("D:\\ideaIU\\Git\\lh\\asiainfo_hn_study\\src\\main\\java\\com/asiainfo/chapter1/luhui/zuoye/c.txt",true);
            System.out.println(u);
            fw.write(u);
            fw.flush();
            fw.close();
            reader.close();
            inputStream.close();
            da.close();
            outputStream.close();
            inputStream.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
