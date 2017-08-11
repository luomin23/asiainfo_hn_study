package com.asiainfo.chapter1.zhangyang.week5_day_03.demo01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by 11 on 2017/8/9.
 */
public class ReadTxt {
    public  void readTxtFile(){
        System.out.println("***********");
        System.out.println("文件的内容是：");
        try {
            File file=new File("G:\\Javaio\\10\\java002.txt");
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file));
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while((lineTxt = bufferedReader.readLine()) != null){
                    System.out.println(lineTxt);
                }
                read.close();
            }else{
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
    }
}

