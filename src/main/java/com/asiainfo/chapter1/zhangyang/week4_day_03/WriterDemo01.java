package com.asiainfo.chapter1.zhangyang.week4_day_03;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;

/**
 * Created by 11 on 2017/8/2.
 */
/*
使用writer向文件中写入内容，并用append
实现对文件内容的追加
 */
public class WriterDemo01 {
    public static void main(String[] args) {
        File file = new File("G:\\Javaio\\10","file3.txt");
        Writer out = null;
        String str = "程序员";
        char c[]=str.toCharArray();//转为数组
        try {
            out = new FileWriter(file);
            out.write(c);
            out.append("freeStyle");//使用append可以实现对文件内容的追加
            out.close();
            System.out.println("写入成功");
        } catch (IOException e) {
            System.out.println("写入失败");
            e.printStackTrace();
        }
    }
}
