package com.asiainfo.chapter1.fengzx.Aug03;

import java.io.*;

/**
 * Created by fengzx on 2017/8/3.
 */
public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("G:\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\copy.txt"));

//        char[] chs = new char[1024];
//        int len = 0;
//        while((len = br.read(chs)) != -1){
//            bw.write(chs,0,len);
//        }

        int ch = 0;
        while ((ch = br.read())!=-1){
            bw.write(ch);
        }

        bw.close();
        br.close();
    }
}
