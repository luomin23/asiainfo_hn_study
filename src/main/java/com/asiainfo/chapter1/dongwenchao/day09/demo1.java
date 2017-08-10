package com.asiainfo.chapter1.dongwenchao.day09;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.Date;

import static java.lang.System.in;

/**
 * Created by 超超 on 2017/8/3 0003.
 */
public class demo1 {
    public static String file = "文件.txt";

    public demo1() {
        try {
            int i = 0;
            int ch;
            Date d1 = new Date();
            FileInputStream f = new FileInputStream(file);
            while ((ch = f.read()) != -1)
                i++;
            f.close();
            Date d2 = new Date();
            long t = d2.getTime() - d1.getTime();
            System.out.printf("读取文件% c(共% d字节)\n", file, i);
            System.out.printf("不带缓存的方法需要% 1$d毫秒\n", t);
            i = 0;
            f = new FileInputStream(file);
            BufferedInputStream fb = new BufferedInputStream(f);
            while ((ch = f.read()) != -1)
                i++;
            fb.close();
            System.out.printf("读取文件% s(共% d字节)\n", file, i);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new demo1();
        /*public static void main(String []args){
            try{
                FileWriter a=new FileWriter("文件.txt");
                a.write("wojiushiwo");
                a.close();
                BufferedReader in=new BufferedReader(new FileReader("文件.txt"));
                String str;
                while ((str = in.readLine()) != null) {
                    System.out.println(str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}