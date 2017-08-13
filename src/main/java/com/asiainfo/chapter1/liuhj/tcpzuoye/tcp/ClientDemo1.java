package com.asiainfo.chapter1.liuhj.tcpzuoye.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class ClientDemo1 {
   static String num;
    public static void main(String[] args) {


        try {
             num ="1";
            Socket socket = new Socket("127.0.0.1", 7502);
            DataOutputStream out =new DataOutputStream(socket.getOutputStream());
            out.writeUTF(num);
           out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
