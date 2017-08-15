package com.asiainfo.chapter1.dongwenchao.day09;

import java.io.*;

/**
 * Created by 超超 on 2017/8/3 0003.
 */
public class demo2 {
    public demo2(){
        try{
            BufferedWriter a=new BufferedWriter(new FileWriter("文件.txt"));
            a.write("wojiushiwp  我就是我   123  Aa");
            a.newLine();
            a.write("a");
            a.newLine();
            a.write("那就这样吧");
            a.newLine();
            a.close();
            /*LineNumberReader b=new LineNumberReader(new FileReader("文件.txt"));*/
            /*String s;
            for (s= b.readLine();s!=null;s= b.readLine())
                System.out.println(b.getLineNumber()+":"+s);*/
            BufferedReader b=new BufferedReader(new FileReader("文件.txt"));
            int  c;
                for (c=b.read();c!=-1;c=b.read())
            System.out.print((char) c);

        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }



    public static void main(String[]args){
        new demo2();
    }
}
