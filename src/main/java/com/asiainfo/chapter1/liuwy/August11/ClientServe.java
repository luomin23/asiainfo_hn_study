package com.asiainfo.chapter1.liuwy.August11;

import com.asiainfo.chapter1.liuwy.August11.ConfigUtils;
import com.asiainfo.chapter1.liuwy.August11.Request;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by LENOVO on 2017/8/11.
 */
public class ClientServe {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("127.0.0.1",9999);
            Request request=new Request();
            request.setServiceName(ConfigUtils.FINDBYPHONE);
            request.setId(1);
            ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(request);
            System.out.println("请求发送完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("h");
    }
}
