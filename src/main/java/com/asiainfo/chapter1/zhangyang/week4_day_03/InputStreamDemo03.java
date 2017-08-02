package com.asiainfo.chapter1.zhangyang.week4_day_03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 11 on 2017/8/2.
 */
/*
循环读取文件内容
 */
public class InputStreamDemo03 {
    public static void main(String[] args) {
        File file = new File("G:\\Javaio\\10","java.txt");
        InputStream inputStream = null;
        byte b[] = new byte[(int)file.length()];
        int tem = 0;
        int len = 0;
        try {
            inputStream = new FileInputStream(file);
            while ((tem=inputStream.read())!=-1){
                b[len]=(byte)tem;
                len++;
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new String(b));
    }
}
