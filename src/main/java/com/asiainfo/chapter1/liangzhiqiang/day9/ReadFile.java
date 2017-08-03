package com.asiainfo.chapter1.liangzhiqiang.day9;

/**
 * Created by 君不悔 on 2017/8/3.
 */
import java.io.*;
public class ReadFile {
    public static void main(String[]args){
        int i;
        FileInputStream fin=null;
        try{
            fin=new FileInputStream(args[0]);
            do {
                i=fin.read();
                if (i!=1)
                    System.out.println((char)i);
            }while (i!=-1);

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                if (fin==null)
                    System.out.println("file not open");
                else {
                    fin.close();
                    System.out.println("file has been read");
                }
                }catch(Exception e){
                e.toString();

                }
            }
        }
    }

