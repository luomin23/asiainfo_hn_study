package com.asiainfo.chapter1.xushuo.x0802_03.Inout;

import java.io.File;
import java.util.Scanner;

/**
 * Created by root on 2017/8/3.
 */
public class ListFile {
    public static void main(String[] args) {
        System.out.println("请输入路径");
        Scanner scan = new Scanner(System.in);
        String path = scan.next();                          //输出路径，使用"\\"代替"\"
        File file = new File(path);
        fileList(file);                                     //调用fileList()方法
    }

    private static void fileList(File file) {
        if(file.isFile())                                   //如果是文件则直接访问文件名
        {
            System.out.println("\t"+file.getName());
        }else if(file.isDirectory()) {                      //若是目录则需要遍历目录
            System.out.println(file.getPath()+"是目录");
            File fileName[] = file.listFiles();             //获取目录中的所有文件和目录
            for (int i = 0 ; i<fileName.length ; i++)
            {
                fileList(fileName[i]);                      //递归调用
            }
        }
    }
}
