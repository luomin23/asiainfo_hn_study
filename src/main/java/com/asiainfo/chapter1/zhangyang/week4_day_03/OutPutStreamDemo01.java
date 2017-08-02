package com.asiainfo.chapter1.zhangyang.week4_day_03;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by 11 on 2017/8/2.
 */
/*
向文本写入指定的字符串内容通过String类的
getbytes方法将字符串转为数组在通过Fileoutputstream
类的write方法将内容写入
 */
public class OutPutStreamDemo01 {
    public static void main(String[] args) {
        File file = new File("G:\\Javaio\\10","file.txt");
        OutputStream outputStream = null;
        String  str ="Hello java!!!";
        byte b[]=str.getBytes();//将字符串转为数组
        try {
            outputStream = new FileOutputStream(file);
            outputStream.write(b);
            outputStream.close();
            System.out.println("写入成功!");
        } catch (IOException e) {
            System.out.println("写入失败！");
            e.printStackTrace();
        }
    }
}
