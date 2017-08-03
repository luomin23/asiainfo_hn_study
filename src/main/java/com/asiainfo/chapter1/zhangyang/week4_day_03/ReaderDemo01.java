package com.asiainfo.chapter1.zhangyang.week4_day_03;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

/**
 * Created by 11 on 2017/8/2.
 */
public class ReaderDemo01 {
    public static void main(String[] args) {
        File file = new File("G:\\Javaio\\10","java.txt");
        Reader reader = null;
        char c[] = new char[(int)file.length()];
        try {
            reader = new FileReader(file);
            reader.read(c);
            reader.close();
        } catch (IOException e) {
            System.out.println("读取失败！");
            e.printStackTrace();
        }
        System.out.println(c);
    }
}
