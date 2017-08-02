package com.asiainfo.chapter1.zhangyang.week4_day_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 11 on 2017/8/2.
 */
/*
使用bufferreader接受来自键盘的数据
 */
public class BufferReaderDemo02 {
    public static void main(String[] args) {
        String str =" ";
        BufferedReader bin = null;
        bin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入内容：");
        try {
            str = bin.readLine();
            bin.close();
        } catch (IOException e) {
            System.out.println("读取失败！");
            e.printStackTrace();
        }
        System.out.println("您输入的的内容：\n"+str);
    }
}
