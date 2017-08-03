package com.asiainfo.chapter1.liangzhiqiang.day8;

/**
 * Created by 君不悔 on 2017/8/2.
 */
import java.io.*;
public class Example2 {
    public static void main(String[]args)throws Exception{
        FileInputStream in=new FileInputStream("test.txt");
        int b=0;
        while (true){
            b=in.read();
            if (b==-1){
                break;
            }
            System.out.println(b);
        }
        in.close();


    }

}
