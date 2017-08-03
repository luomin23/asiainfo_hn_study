package com.asiainfo.chapter1.Jiashihao.Java83;

/**
 * Created by lenovo on 2017/8/3.
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class dayinliu {
    public static void main(String args[])throws Exception{
        PrintStream ps = null;
        ps = new PrintStream(new FileOutputStream(new File("d:"+ File.separator+"test.txt")));
        ps.print("hello ");
        ps.println("world!!!");
        ps.print("1+1="+2);
        ps.close();
    }
}
