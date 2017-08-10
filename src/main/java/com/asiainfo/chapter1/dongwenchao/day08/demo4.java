package com.asiainfo.chapter1.dongwenchao.day08;

import java.io.*;

/**
 * Created by 超超 on 2017/8/2 0002.
 */
public class demo4 {
    public demo4(){
        try{
            File a=new File("文件.txt");
            InputStreamReader c=new InputStreamReader(new FileInputStream(a),"UTF-8");

            /*FileInputStream a=new FileInputStream("文件.txt");//文件放在一个大目录下。*/
            int i;
            int b=c.read();
            for (i=0;b!=-1;i++){
                System.out.print((char)b);
                /*byte[] b1 = a.getBytes("UTF-8");*/
                        b=c.read();
            }
            System.out.println();
            System.out.println("文件字节数为："+i);
            c.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        new demo4();
    }
}
