package com.asiainfo.chapter1.luhui.luhui8;

import java.io.File;
import java.util.ArrayList;
import java.util.*;

/**
 * Created by 18237161432 on 2017/8/2.
 */
public class FileDemo {
    public static void main(String[] args){
       // try{
        File file=new File("D:\\ideaIU\\s\\3.txt");
        file.mkdir();
        try{
        if(!file.exists()){//是否为文件。
            long size=file.length();
            System.out.println(args[0] +"文件");
            System.out.println(file.canRead()?"可读":"不可读");
            System.out.println(file.canWrite()?"可写":"不可写");
            System.out.println(size+"字节");
        }
       else{
            File[] files=file.listFiles();//列出所有的文件及目录。
            ArrayList<File> fileList=new ArrayList<File>();
            for(int i=0;i<files.length;i++){
                if (files[i].isDirectory()){
                    System.out.println("["+files[i].getPath()+"]");//取得路径。
                }
                else{
                    fileList.add(files[i]);//文件先存入fileList,待会在列出。
                }
            }
            for (File f:fileList){
                System.out.println(f.toString());//列出文件
            }
            System.out.println();
        }
        }catch(ArrayIndexOutOfBoundsException e){
          System.out.println("using:Java FileDemo pathname");
        }

    }
}
