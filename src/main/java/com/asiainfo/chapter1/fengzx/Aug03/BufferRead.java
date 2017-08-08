package com.asiainfo.chapter1.fengzx.Aug03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by fengzx on 2017/8/3.
 */
public class BufferRead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("G:\\a.txt"));

//        int ch = 0;
//        while ((ch = br.read()) != -1){
//            System.out.print((char)ch);
//        }
//
//        char[] chs = new char[1024];
//        int len = 0;
//        while ((len = br.read(chs)) != -1){
//            System.out.print(String.valueOf(chs,0,len));
//        }

        String line = null;
        while ((line = br.readLine())!= null){
            System.out.println(line);
        }

        br.close();
    }
}
