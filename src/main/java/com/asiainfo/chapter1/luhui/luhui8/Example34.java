package com.asiainfo.chapter1.luhui.luhui8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.*;

/**
 * Created by 18237161432 on 2017/8/3.
 */
public class Example34 {
    public static void main(String[] args) throws java.lang.Exception {
        Reader reader=new InputStreamReader(new FileInputStream("D:\\ideaIU\\a.txt"),"GBK");
        char[] chs=new char[100];
        int len;
        len=reader.read(chs);
        for (int i=0;len!=-1;i++){
            System.out.print((char)len);
            len= (char) reader.read();
        }
        System.out.println();
        reader.close();
    }
}
