package com.asiainfo.chapter1.zhangyang.week4_day_03;

import java.io.*;

/**
 * Created by 11 on 2017/8/2.
 */
/*
使用file中lenth方法开辟合理大小的数组
不浪费内存空间
 */
public class InputStreamDemo02 {
    public static void main(String[] args) {
        File file = new File("G:\\Javaio\\10","java.txt");
        byte b[]  = new byte[(int)file.length()];
        try {
            InputStream inputStream = new FileInputStream(file);
            try {
                inputStream.read(b);
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(new String(b));
    }
}
