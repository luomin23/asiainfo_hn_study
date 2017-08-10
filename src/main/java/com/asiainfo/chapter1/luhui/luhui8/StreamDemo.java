package com.asiainfo.chapter1.luhui.luhui8;

import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 18237161432 on 2017/8/2.
 */
public class StreamDemo {
    public static void main(String[] args){
        int num;
        byte[] dat=new byte[20];
        try{

           FileInputStream in=new FileInputStream("D:\\ideaIU\\a.txt");
            while ((num=in.read(dat,0,20))!=-1){
                String s=new String(dat,0,num);
                System.out.print(s);
            }
            in.close();


        }
        catch (IOException e){
            System.out.println(e);
        }


    }
}