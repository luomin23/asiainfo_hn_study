package com.asiainfo.chapter1.dongwenchao.day15;

import java.io.IOException;

/**
 * Created by 超超 on 2017/8/11 0011.
 */
public class demo6 {
    public static void main(String[] args) throws IOException {
        System.out.print("请从键盘输入数据：");
        byte buffer[]=new byte[512];
        int count=System.in.read(buffer);//标准字节流读出
        System.out.print("通过标准的输出，输出的数据：");
        for (int i=0;i<count;i++)
            System.out.printf(""+buffer[i]);
        System.out.println();
        for (int i=0;i<count;i++)
            System.out.print((char)buffer[i]);
        System.out.println("count="+count);
    }
}
