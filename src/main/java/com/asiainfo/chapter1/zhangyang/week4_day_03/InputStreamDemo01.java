package com.asiainfo.chapter1.zhangyang.week4_day_03;

import java.io.*;

/*
 * Created by 11 on 2017/8/2.
 */
/*
字节输入流，使用read方法读取文本里的内容
 */
public class InputStreamDemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("G:\\Javaio\\10","java.txt");
        byte b[] = new byte[512];
        InputStream inputStream = new FileInputStream(file);
        try {
                inputStream.read(b);
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(new String(b));
        }
}
