package com.asiainfo.chapter1.zhangyang.week4_day_04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 11 on 2017/8/3.
 */
public class BufferedWriterDemo01 {
    public static void main(String[] args) {
        File file = new File("G:\\Javaio\\10","file5.txt");
        FileWriter fileWriter = null;
        String str[] ={"契而舍之","朽木不折","锲而不舍","金石可镂"};
        BufferedWriter bw = null;
        try {
            fileWriter= new FileWriter(file);
            bw = new BufferedWriter(fileWriter);
            for (int i = 0; i <str.length ; i++) {
                bw.write(str[i]);
                bw.newLine();
            }
            bw.close();
            fileWriter.close();
            System.out.println("写入成功！");
        } catch (IOException e) {
            System.out.println("写入失败！");
            e.printStackTrace();
        }
    }
}
