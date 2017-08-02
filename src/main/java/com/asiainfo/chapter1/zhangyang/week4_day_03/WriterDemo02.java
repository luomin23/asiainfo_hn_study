package com.asiainfo.chapter1.zhangyang.week4_day_03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by 11 on 2017/8/2.
 */
/*
操作字符流不执行close方法，字符串内容将写不到文件中
 */
public class WriterDemo02 {
    public static void main(String[] args) {
        File file = new File("G:\\Javaio\\10","file4.txt");
        Writer out = null;
        String str = "程序员";
        char c[]=str.toCharArray();//转为数组
        try {
            out = new FileWriter(file);
            out.write(c);
           // out.append("freeStyle");//使用append可以实现对文件内容的追加
           // out.close();
            out.flush();
            System.out.println("写入成功");
        } catch (IOException e) {
            System.out.println("写入失败");
            e.printStackTrace();
        }
    }
}
