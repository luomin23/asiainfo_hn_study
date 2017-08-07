package com.asiainfo.chapter1.wangjz.java.javaday1.javaday8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by wjz123456 on 2017/8/2.
 */
public class FileoutputStream {
    public FileoutputStream(){
        String s="有志者,事竟成，百二秦关终归楚....";
        byte[] b= new byte[0];
        try {
            b = s.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream f = new FileOutputStream("wjz.txt");
           // f.write(b);
          //  f.write(b,0,46);
            f.flush();
            f.close();
        }  catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new FileoutputStream();
    }
}
