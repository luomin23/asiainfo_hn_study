package com.asiainfo.chapter1.dongwenchao.day12;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
//服务器端
/**
 * Created by 超超 on 2017/8/8 0008.
 */
public class demo15 {
    public static void main(String[] args) {
        try{
            ServerSocket s = new ServerSocket(9000);
            while (true) {
                Socket incoming =s.accept();
                try
                {
                    FileInputStream fstream = new FileInputStream("asd"); //假设输入文件为Server.java
                    DataInputStream in =new DataInputStream(fstream);
                    BufferedReader br = new BufferedReader(new InputStreamReader(in));
                    OutputStream stream = incoming.getOutputStream();
                    PrintWriter out = new PrintWriter(stream, true);
                    String strLine;
                    while ((strLine =br.readLine()) != null) {
                        out.println(strLine);
                    }
                    in.close();
                }
                finally {
                    incoming.close();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
