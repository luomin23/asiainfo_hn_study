package com.asiainfo.chapter1.wangjz.java.javaday1.javaday8;

import java.io.FileInputStream;
import java.io.*;
import java.lang.*;
import java.io.IOException;

/**
 * Created by wjz123456 on 2017/8/2.
 */
public class FileinputStream {
    public FileinputStream(){
        try{
            File f=new File("wjz.txt");
            InputStreamReader ii=new InputStreamReader(new FileInputStream(f),"UTF-8");
            int i;

            int b=  ii.read();
            for (i=0;b!=-1;i++){
                System.out.print((char)b);
                b=  ii.read();
            }
            System.out.println();
            System.out.println("字符数 "+i);
            ii.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new FileinputStream();
    }
}
