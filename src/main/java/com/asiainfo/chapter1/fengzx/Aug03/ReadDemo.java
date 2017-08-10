package com.asiainfo.chapter1.fengzx.Aug03;

import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by fengzx on 2017/8/3.
 */
public class ReadDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("G:\\a.txt");

//        int ch = fr.read();
//        while(ch != -1){
//            System.out.print((char)ch);
//            ch = fr.read();
//        }

//        int ch = 0;
//        while((ch = fr.read()) != -1){
//            System.out.print((char)ch);
//        }

//        char[] chs = new char[5];
//
//        int len = fr.read(chs);
//        while (len !=-1) {
//            System.out.print(String.valueOf(chs, 0, len));
//            len = fr.read();
//        }

        char[] chs = new char[1024];
        int len = 0;
        while ((len = fr.read(chs))!=-1){
            System.out.print(String.valueOf(chs, 0, len));
        }
        fr.close();
    }
}
