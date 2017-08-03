package com.asiainfo.chapter1.xushuo.x0802_03.Inout;

import java.io.File;
import java.io.IOException;

/**
 * Created by root on 2017/8/3.
 * 用create NewFile
 */
public class FileDemo01 {
    public static void main(String[] args) {
        File file = new File("E:","file.txt");
        try{
            file.createNewFile();
            System.out.println("创建成功！！");
        }
        catch (IOException e) {
            System.out.println("创建失败！！");
            e.printStackTrace();
        }
    }
}
