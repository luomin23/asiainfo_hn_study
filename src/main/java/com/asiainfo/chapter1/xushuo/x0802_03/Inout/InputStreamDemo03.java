package com.asiainfo.chapter1.xushuo.x0802_03.Inout;

import java.io.*;

/**
 * Created by root on 2017/8/3.
 * 读取指定文件中的内容
 */
public class InputStreamDemo03 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\root\\Desktop", "JAVA.txt");            //声明file类实例

        //使用read(char c[])
        Reader read = null;                                                      //声明read对象
        char c[] = new char[(int) file.length()];                                //根据文件大小自定义数组空间
        try {                                                                    //处理异常
            read = new FileReader(file);                                         //使用FileReader实例化Reader
            read.read(c);                                                        //读取内容存入char数组
            read.close();                                                        //关闭输出流
        } catch (IOException e) {
            System.out.println("读取失败！！");
            e.printStackTrace();
        }
        System.out.println(c);
    }
}

//        InputStream input = null;                                               //声明InputStream对象
//        byte b[] = new byte[(int)file.length()];                                //根据文件内容的大小定义数组空间
//        int temp = 0;                                                           //接受每一个读取的内容
//        int len = 0;                                                            //读取数据的个数
//        try{                                                                    //处理异常
//            input = new FileInputStream(file);                                  //使用FileInputSteam为InputStream实例化
//            while ((temp=input.read())!=-1)                                     //使用while循环读取文件内容，到达结尾是temp=-1
//            {
//                b[len]=(byte)temp;
//                len++;
//            }
//            input.close();                                                      //关闭输出流
//        }
//        catch (IOException e){                                                  //捕抓异常
//            e.printStackTrace();
//        }
//        System.out.println(new String(b));                                      //输出读取的内容
//    }
//}
