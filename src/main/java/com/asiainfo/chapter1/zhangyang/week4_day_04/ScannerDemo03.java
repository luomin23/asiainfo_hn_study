package com.asiainfo.chapter1.zhangyang.week4_day_04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by 11 on 2017/8/3.
 */
public class ScannerDemo03 {
    public static void main(String[] args) {
        File file = new File("G:\\Javaio\\10", "file5.txt");
        if (!(file.exists())) ;{
            System.out.println("文件不存在!!!");
            System.exit(0);
        }
        FileInputStream fileInputStream = null;
        Scanner scanner = null;
        try {
            fileInputStream = new FileInputStream(file);
            scanner = new Scanner(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuffer sbu = new StringBuffer();
        while (scanner.hasNext()){
            sbu.append(scanner.next()).append("\n");
        }
        System.out.println(sbu);
    }
}
