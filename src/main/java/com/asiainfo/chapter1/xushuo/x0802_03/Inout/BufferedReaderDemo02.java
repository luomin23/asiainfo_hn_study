package com.asiainfo.chapter1.xushuo.x0802_03.Inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by root on 2017/8/3.
 * 从键盘获取数据并输出
 */
public class BufferedReaderDemo02 {
    public static void main(String[] args) {
        String str =" ";                                                    //定义字符串
        BufferedReader bin = null;                                          //声明BufferedReader对象
        try                                                                 //处理异常
        {
            bin = new BufferedReader(new InputStreamReader(System.in));     //实例化BuffereedReader对象，从键盘获取数据
            System.out.println("请输入内容：");
            str=bin.readLine();                                             //读取内容存入char数组
            bin.close();                                                    //关闭缓冲流
        }
        catch (IOException e) {
            System.out.println("读取失败！！");
            e.printStackTrace();
        }
        System.out.println("您输入的内容：\n"+str);
    }
}
