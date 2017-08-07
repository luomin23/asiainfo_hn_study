package com.asiainfo.chapter1.liangzhiqiang.day11;



/**
 * Created by 君不悔 on 2017/8/7.
 */
//如何使用BufferedReader和BufferedWriter这两个包装实现文件的拷贝
import java.io.*;
public class Example3 {
    public static void mian(String[]args)throws Exception{
        FileReader reader=new FileReader("src.txt");
        //创建一个BufferedReader缓冲对象
        BufferedReader br=new BufferedReader(reader);
        FileWriter writer=new FileWriter("des.txt");
        //创建一个BufferedWriter缓冲对象
        BufferedWriter bw=new BufferedWriter(writer);
        String str;
        while ((str=br.readLine())!=null){        //每次读取一行文本，判断是否到文件末尾
            bw.write(str);
            bw.newLine();                         //写入一行换行符，该方法会根据不同的操作系统生成相应的换行符
        }
        br.close();
        bw.close();
    }
}
