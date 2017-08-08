package com.asiainfo.chapter1.liangzhiqiang.day11;

/**
 * Created by 君不悔 on 2017/8/7.
 */
//如何使用FileWrite将字符写入文件
import java.io.*;
public class Writer {
    public static void main(String[]args)throws Exception{
        //创建一个FileWriter对象用于向文件中写入数据
        FileWriter writer=new FileWriter("writer.txt");
        String str="联系人";
        writer.write(str);     //将字符数据写入到文本文件中
        writer.write("\r\n");  //将输出语句换行
        writer.close();        //关闭写入流，释放资源
    }
}
