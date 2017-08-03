package com.asiainfo.chapter1.zhangyang.week4_day_04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by 11 on 2017/8/3.
 */
public class RandomAccessFileDemo01 {
    public static void main(String[] args) {
        File file = new File("G:\\Javaio\\10","random9.txt");
        try {
            RandomAccessFile raf = new RandomAccessFile(file,"rw");
            try {
                raf.writeInt(56);
                raf.writeChar('华');
                raf.writeLong(123456L);
                raf.writeUTF("中国");
                raf.close();
                System.out.println("写入成功！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
