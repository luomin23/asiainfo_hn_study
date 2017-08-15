package com.asiainfo.chapter1.xushuo.ScoketDemo03;

import com.asiainfo.chapter1.xushuo.ScoketDemo03.*;

/**
 * Created by root on 2017/8/12.
 */
//两个文件传输
public class Test {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\root\\Desktop\\JAVA.txt";

        System.out.println(filePath);
        com.asiainfo.chapter1.xushuo.ScoketDemo03.ReadFile02 readFile=new com.asiainfo.chapter1.xushuo.ScoketDemo03.ReadFile02();
        readFile.readTxtFile(filePath);
        Jdbc03.getConnection();
    }
}
