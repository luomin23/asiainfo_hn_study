package com.asiainfo.chapter1.dongwenchao.day09;

import java.io.*;

/**
 * Created by 超超 on 2017/8/3 0003.
 */
public class demo3 {
    public static void main(String []args)throws IOException{
        File f=new File("a.txt");
        FileOutputStream a=new FileOutputStream(f);
        OutputStreamWriter writer=new OutputStreamWriter(a,"UTF-8");
        writer.append("我 ");
        writer.close();
        a.close();
        FileInputStream b=new FileInputStream(f);
        InputStreamReader reader=new InputStreamReader(b,"UTF-8");
        int d;
        for (d=reader.read();d!=-1;d=reader.read())
        System.out.println((char)d);
    }
}
