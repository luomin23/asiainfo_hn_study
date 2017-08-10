package com.asiainfo.chapter1.liangzhiqiang.day11;

/**
 * Created by 君不悔 on 2017/8/7.
 */
import java.io.*;
public class Write {
    public static void main(String[]args)throws Exception{
        FileOutputStream out=new FileOutputStream("example.txt");
        String str="导入联系人";
        byte []b=str.getBytes();
        for (int i=0;i<b.length;i++){
            out.write(b[i]);
        }
        out.close();
    }
}
