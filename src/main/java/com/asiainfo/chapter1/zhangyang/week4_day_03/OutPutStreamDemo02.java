package com.asiainfo.chapter1.zhangyang.week4_day_03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by 11 on 2017/8/2.
 */
/*
使用字符流writer想文件内部写入文件不需要将字符串转为数组
 */
public class OutPutStreamDemo02 {
    public static void main(String[] args) {
        File file = new File("G:\\Javaio\\10","file2.txt");
        Writer out = null;
        String str = "java编程思想！";
        try {
            out = new FileWriter(file);
            out.write(str);
            out.close();
            System.out.println("写入成功！");
        } catch (IOException e) {
            System.out.println("写入失败！");
            e.printStackTrace();
        }
    }
}
