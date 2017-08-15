package com.asiainfo.chapter1.dongwenchao.day12;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by 超超 on 2017/8/8 0008.
 */
//客户端
public class demo16 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 9000);
            try {
                InputStream inStream = s.getInputStream();
                Scanner in = new Scanner(inStream);
                PrintWriter out = new PrintWriter("asd");//假设输出文件为test.txt
                while (in.hasNextLine()) {
                    String line = in.nextLine();
                    System.out.println(line);
                    out.println(line);
                }
                out.close();
            } finally {
                s.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}