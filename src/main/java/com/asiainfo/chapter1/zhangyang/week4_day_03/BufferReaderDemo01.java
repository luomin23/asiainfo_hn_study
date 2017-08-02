package com.asiainfo.chapter1.zhangyang.week4_day_03;

import java.io.*;

/**
 * Created by 11 on 2017/8/2.
 */
public class BufferReaderDemo01 {
    public static void main(String[] args) {
        File file = new File("G:\\Javaio\\10","file2.txt");
        Reader reader = null;
        BufferedReader buf= null;
        String  str = "";
        try {
            reader = new FileReader(file);
            buf = new BufferedReader(reader);
            str=buf.readLine();
            buf.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("读取失败！");
            e.printStackTrace();
        }
        System.out.println(str);
    }
}
